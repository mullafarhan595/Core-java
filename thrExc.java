class   thrExc
{
    public static void main(String  ar[])
    {
        try
        {
              throw   new  ArithmeticException();  
        }
        catch(ArithmeticException   e)
        {
                System.out.println("ArithmeticException handled...");
        }
    }
}