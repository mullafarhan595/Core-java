class   Student
{
    int roll;
    String name;
    double  per;
    Student()
    {
        roll=1;
        name="abc";
        per=78.20;
    }
    Student(int  a)
    {
        roll=a;
        name="pqr";
        per=47.50;
    }
    Student(int a,String b)
    {
        roll=a;
        name=b;
        per=60.52;
    }
    Student(int a,String b,double c)
    {
        roll=a;
        name=b;
        per=c;
    }
    void show()
    {
        System.out.println("Roll="+roll);
        System.out.println("Name="+name);
        System.out.println("Percentage="+per);
    }
    public static void main(String ar[])
    {
       Student   x=new Student();   
       Student   y=new Student(10);
       Student   z=new Student(25,"rahul");
       Student   p=new Student(15,"rohit",95.20);
       x.show();
       y.show();
       z.show();
       p.show();
    }

}