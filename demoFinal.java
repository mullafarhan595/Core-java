class   A
{
    final  int   x=52;
    void  show()
    {
        x++;
        System.out.println("I am in base class");
    }
}
class   B   extends    A 
{
    void  show()
    {
        System.out.println("I am in Derived class");
    }
}
class   demoFinal
{
    public static void main(String ar[])
    {
        B    obj=new   B();
        obj.show();
    }
}