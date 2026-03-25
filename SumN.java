class   SumN
{
    public static void  main(String  []ar)
    {
        int   n=Integer.parseInt(ar[0]);
        int  i=1,s=0;
    while(i<=n)
    {
        s=s+i;
        i++;
    }

    System.out.println("Sum="+s);

    }
}
