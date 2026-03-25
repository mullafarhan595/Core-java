class   base
{
    int   a;
    base(int  z)
    {
      a=z;  
    }
}
class  derive   extends   base
{
    int   a=50;
    derive()
    {
         super(25);  //call to para. contruc. of base class
    }
    void show()
    {
       
        System.out.println("Value of a from base:"+super.a);
        System.out.println("Value of a from derive:"+a);

    }
}
class   superDemo
{
    public static void main(String ar[])
    {
        derive  obj=new derive();
        obj.show();
    }
}