class   third   extends   Thread 
{
    public void  run()
    {
        int  i;
        System.out.println(Thread.currentThread().getPriority());
    }
}
class  Thread3
{
    public static void main(String ar[])
    {
        third   t1=new  third();
        third   t2=new  third();
        third   t3=new  third();
        third   t4=new  third();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(25);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}