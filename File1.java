import   java.io.*;
class     File1
{
    public  static void main(String  ar[])  throws   IOException
    {
        try
        {
           int   ch;
           FileReader     in=new    FileReader("e:\\filedata\\read.txt");

           while((ch=in.read())!=-1)
           { 
                System.out.print((char)ch);
           }

           in.close();

        }
        catch(FileNotFoundException   e)
        {
            System.out.println(e);
        }
    }
}