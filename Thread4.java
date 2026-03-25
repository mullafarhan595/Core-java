class  four   extends   Thread  
{
    synchronized void  mywork()
    {
        System.out.println(Thread.currentThread());
        for(int i=1;i<=5;i++)
        {
            System.out.println("   "+i);
        }
    }
    public void   run()
    {
        mywork();
    }

}
class   Thread4
{
    public  static void main(String  ar[])
    {
        four    t1=new   four();
        four    t2=new   four();
        t1.start();
        t2.start();

    }
}