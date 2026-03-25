class  thisDemo
{
    int roll;
    String  name;
    thisDemo()
    {
      this(65,"RAHUL");      //call to para. constructor
    }
    thisDemo(int  roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
    void show()
    {
        System.out.println("Roll="+roll);
        System.out.println("Name="+name);
    }
    public static void main(String ar[])
    {
        thisDemo  obj=new thisDemo();
        obj.show();
    }
}