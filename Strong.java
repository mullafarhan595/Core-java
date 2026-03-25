class   Strong
{
    public static void main(String ar[])
    {
        int  n=Integer.parseInt(ar[0]);
        int  f,r,s=0,t=n;
       while(n!=0)
       { 
            f=1;
            r=n%10;
            while(r>=1)
            {
                f=f*r;
                r--;
            }
         s=s+f;
         n=n/10;
       }

       if(s==t)
          System.out.println("Number is STRONG");
       else
        System.out.println("Number is NOT STRONG");
    }
}