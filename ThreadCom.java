class   producer    extends   Thread
{
    StringBuffer   sb;    //it mutable i.e. obj. data can be changed
    producer()
    {
        sb=new  StringBuffer();    //allocates memory
    }

    public void  run()
    {
        synchronized(sb)
        {
         try
          {
            for(int  i=1;i<=10;i++)
            {
                Thread.sleep(1000);
                sb.append(i+":");
                System.out.println("Producing ..."+i);
            }
            System.out.println("Production is over..");
            sb.notify();
          }
          catch(InterruptedException  e)
          {
            System.out.println(e);
          }
        }
    }

}
class   consumer   extends  Thread
{
        producer   p;
        consumer(producer   x)
        {
            p=x;
        }
    public void  run()
    {
        synchronized(p)
        {
            try
            {
              p.wait();
              System.out.println("Consumer used Production:"+p.sb);
            }
            catch(InterruptedException   e)
            {
               System.out.println(e); 
            }

        }
    }
}
class  ThreadCom
{
    public static void main(String ar[])
    {
        producer   t1=new  producer();
        consumer   t2=new  consumer(t1);
        t1.start();
        t2.start();
    }
}