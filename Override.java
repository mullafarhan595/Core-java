class   first
{
    void  show()
    {
        System.out.println("I am in base class");
    }
}
class   second   extends    first
{
    void  show()
    {
        System.out.println("I am in Derived class");
    }
}
class  Override
{
    public  static  void  main(String  a[])
    {
        second  obj=new   second();
        obj.show();
    }
}
