import  java.io.*;
class   myClass
{
    void  method()  throws   IOException
    {
        System.out.println("Method body..");
    }
}
class  useThrows
{
     public static void main(String  ar[])  throws  IOException
     {
        myClass    obj=new myClass();
        obj.method();  
        System.out.println("main() method..");
     }
}