class  firstThread  extends  Thread
{
    public  void  run()
    {
          int i;
          for(i=1;i<=10;i++)
          {
            System.out.print("  "+i);
          }
    }
}
class   ThreadDemo1
{
    public static void main(String ar[])
    {
        firstThread  t1=new  firstThread();
        firstThread  t2=new  firstThread();
        firstThread  t3=new  firstThread();
        t1.start();   //It call to run()
        t2.start();
        t3.start();
    }
}



















































