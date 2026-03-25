import   java.util.Scanner;
class    stringExc   extends   Exception
{
    stringExc(String   msg)
    {
        super(msg);
    }
}

class   vowelExc
{
    public  static  void main(String ar[])
    {
        int  len,i;
        int  temp=0;
        char  ch;
        String   str;
        try
        {
        Scanner   sc=new Scanner(System.in);
        System.out.println("Enter any string: ");
        str=sc.next();
        len=str.length();
        for(i=0;i<=len-1;i++)
        {
            ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                 temp=1;   
            }
        }
        if(temp==1)
        {
            System.out.println("String Has vowels...");
        }
        else
        {
            throw    new   stringExc("String does not have VOWELS...");
        }
        }
        catch(stringExc   e)
        {
            System.out.println(e);
        }
    }
}