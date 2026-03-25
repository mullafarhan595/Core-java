class overload
{
    void  add()
    {
        int  x,y,z;
        x=5;
        y=10;
        z=x+y;
        System.out.println("FirstAdd="+z);
    }
    void  add(int  a)
    {
        int  x=40,z;
        z=a+x;
        System.out.println("SecondAdd="+z);
    }
    void  add(int  a,int  b)
    {
            int  z;
            z=a+b;
            System.out.println("ThirdAdd="+z);

    }
    public static void main(String  ar[])
    {
        overload   obj=new  overload();
        obj.add();  //call
        obj.add(50);   //call
        obj.add(4,8);  //call
    }
}