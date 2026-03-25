import   java.io.*;
class   File3
{
    public static void main(String   ar[])  throws    IOException
    {
        try
        {
            int  ch;
            FileInputStream   in=new   FileInputStream("e:\\filedata\\read.txt");
            FileOutputStream  out=new  FileOutputStream("e:\\filedata\\copy.txt");
            
            while((ch=in.read())!=-1)
            {
                out.write(ch);
            }
            in.close();
            out.close();
        }
        catch(Exception    e)
        {
            System.out.println(e);
        }

    }
}