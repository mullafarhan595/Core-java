import  java.util.*;
class   multExc
{
    public static void main(String  ar[])
    {
        int   a,b,c;
        Scanner    sc=new  Scanner(System.in);
              try
              {
                System.out.println("Enter Two NO=");
                a = sc.nextInt();
                b = sc.nextInt();
                c = a / b;
               System.out.println("Result = "+c);
              }
              catch(ArithmeticException    t)
              {
                    System.out.println("Number cannot divide by zero.");
              }
              catch(InputMismatchException    e)
              {
                      System.out.println("Enter only numeric value.");
              }


    }
}