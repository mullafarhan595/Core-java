class   Emp
{
    int  id;
    String  name;
    double  sal;
    Emp(int  a,String b,double c)    //paramterized constructor
    {
        id=a;
        name=b;
        sal=c;
    }
    void show()
    {
        System.out.println("Emp ID="+id);
        System.out.println("EmpName="+name);
        System.out.println("Salary="+sal);
    }
    public static void main(String ar[])
    {
        Emp  obj=new Emp(50,"Ramesh",4562.50);
        obj.show();
    }
}