class   nullExc
{
    public static void main(String arg[])
    {
        String    str=null;
        int   len;
        try
        {
           len=str.length();
           System.out.println("Lenth="+len);
        }
        catch(NullPointerException   e)
        {
            System.out.println("NullPointerException handled.....");
        }
    }
}