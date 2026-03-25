class   useFinally
{
    public static void main(String   ar[])
    {
        int    x[]=new  int[5];
           try
          {
              x[15]=45;
              System.out.println("Value="+x[1]);
           }
        catch(ArrayIndexOutOfBoundsException   e)
        {
            System.out.println("Exception Handled...");
        }
        finally 
        {
            System.out.println("Finally block executed..");
        }       
    }
}