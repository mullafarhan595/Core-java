class   DigitSum
{
    public static void  main(String   ar[])
    {
        int n=Integer.parseInt(ar[0]);
        int r,s=0;
       while(n!=0)
       { 
        r=n%10;
        s=s+r;
        n=n/10;
       }
        System.out.println("Digit Sum="+s);
    }
}