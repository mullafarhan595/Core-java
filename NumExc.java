class  NumExc
{
    public static void   main(String  ar[])
    {
        String   str="sangola";
        int  x;
        try
        {
           x=Integer.parseInt(str);
           System.out.println(x);
        }
        catch(NumberFormatException   e)
        {
            System.out.println("NumberFormatException handled...");
        }
    }
}