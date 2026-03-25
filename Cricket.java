import    java.util.Scanner;
class  Cricket
{
    byte cno;
    String name;
    String add;
    float bat_avg;
    double b_avg;
    int wk;
    long runs;
    void  accept()
    {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter cricketer No=");
        cno=sc.nextByte();
        System.out.println("Enter cricketer Name=");
        name=sc.next();
        System.out.println("Enter cricketer Bat AVG=");
        bat_avg=sc.nextFloat();
        System.out.println("Enter cricketer Balling AVG=");
        b_avg=sc.nextDouble();
        System.out.println("Enter cricketer Total WKts=");
        wk=sc.nextInt();
        System.out.println("Enter cricketer Total Runs=");
        runs=sc.nextLong();
        System.out.println("Enter cricketer address=");
        add=sc.next();
    }
    void  display()
    {
        System.out.println("cricketer No="+cno);
        System.out.println("cricketer Name="+name);
        System.out.println("cricketer address="+add);
        System.out.println("cricketer Bat AVG="+bat_avg);
        System.out.println("cricketer Balling AVG="+b_avg);
        System.out.println("cricketer Total WKts="+wk);
        System.out.println("cricketer Total Runs="+runs);
    }
    public static void main(String  ar[])
    {
        Cricket   obj=new    Cricket();
        obj.accept();
        obj.display();
    }
}