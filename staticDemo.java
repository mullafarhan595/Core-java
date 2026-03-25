class   staticDemo
{
   static String  name="Sanjay";
   int   x=50;
    static void show()
    {
        System.out.println("Name="+name);
        staticDemo obj=new staticDemo();
        System.out.println(obj.x);
    }
    public static void main(String asr[])
    {
        staticDemo.show();  //call
    }
}
