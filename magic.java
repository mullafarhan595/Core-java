class   magic
{
    public static void main(String  ar[])
    {
        int   n=Integer.parseInt(ar[0]);
        int  r,s=0;
       while(n>9)
       {
            s=0;
            while(n!=0)
            {
                r=n%10;
                s=s+r;
                n=n/10;
            }
          if(s>9)
          {
            n=s;   
          }
       }

     if(s==1)
        System.out.println("Number is Magic");
     else
        System.out.println("Number is NOT Magic");
    }
}