class   DemoArith
{
    public static void main(String ar[])
    {
        int   a,b,c;
        a=5;
        b=0;
        try
        {
           c=a/b;
           System.out.println("Division="+c);
        }
        catch(ArithmeticException   e)
        {
            System.out.println("Number can not divide by zero..");
        }

    }
}