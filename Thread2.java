class   SecondThread   implements   Runnable
{
    public void   run()
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.print("  "+i);
        }
    }
}
class Thread2
{
    public static void main(String ar[])
    {
            SecondThread    x=new SecondThread();
            SecondThread    y=new  SecondThread();
            Thread    t1=new Thread(x);
            Thread    t2=new  Thread(y);
            t1.start();
            t2.start();
    }
}

