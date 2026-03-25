class   myThread  
{
    public   void  show()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
class   five   extends   Thread  
{
    myThread    x;
    five(myThread   y)
    {
        x=y;
    }
    public void run()
    {
        synchronized(x)
        {
            System.out.println(Thread.currentThread());
            x.show();
        }
    }
}
class    Thread5
{
    public static void main(String ar[])
    {
            myThread   obj=new myThread();
            five   t1=new   five(obj);
            five   t2=new   five(obj);
            t1.start();
            t2.start();

    }
}