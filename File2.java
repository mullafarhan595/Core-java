import   java.io.*;
class    File2
{
    public static void main(String  ar[])   throws   IOException
    {
        try
        {
            char   ch;
            int  i;
            FileWriter   out=new   FileWriter("e:\\filedata\\write.txt");
            String     str="RAMESH KALE";
            int    len=str.length();
            for(i=0;i<=len-1;i++)
            {
                  ch=str.charAt(i);
                  out.write(ch);
            }
            out.close();
        }
        catch(Exception   e)
        {
            System.out.println(e);
        }

    }
}