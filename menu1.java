import  java.util.Scanner;
class  menu1
{
    float    r,base,ht,side,z;
    float    pi=3.14f;
    Scanner  sc=new Scanner(System.in);
    void  areacir()
    {
      System.out.println("Enter radius=");
      r=sc.nextFloat();
      z=pi*r*r;
      System.out.println("Area of Cir="+z);
    }
    void  percir()
    {
      System.out.println("Enter radius=");
      r=sc.nextFloat();
      z=2*pi*r;
      System.out.println("Circumferance of Cir="+z);
    }
    void  areatri()
    {
        System.out.println("Enter base and Ht=");
        base=sc.nextFloat();
        ht=sc.nextFloat();
        z=(0.5f)*base*ht; 
        System.out.println("Area of Triangle="+z);
    }
    void  areasqr()
    {
        System.out.println("Enter side=");
        side=sc.nextFloat();
        z=side*side;
        System.out.println("Area of Sqr="+z);
    }
public static void main(String  ar[])
{
    int   ch;
    menu1   obj=new menu1();
    Scanner   sc1=new Scanner(System.in);
    System.out.println("Enter your choice");
    System.out.println("1:Area of Circle\n2:Circumferance of circle\n3:Area of Triangle\n4:Area Square");
    ch=sc1.nextInt();
    switch(ch)
    {
        case  1:
               obj.areacir();
               break;
        case  2:
                obj.percir();
                break;
        case   3:
                obj.areatri();
                break;
        case   4:
                obj.areasqr();
                break;
    }

}
}