interface   A 
{
    int   p=10;
    void  calculate();
}
interface   B
{
    int   p=20;
    void  calculate();
}
interface   C
{
    int   p=30;
    void  calculate();
}
class     D     implements    A,B,C
{
    int  z;
    public   void   calculate()
    {
        z=A.p+B.p+C.p;
        System.out.println("Addi="+z);
    }
}
class    multi
{
    public static void main(String ar[])
    {
        D    obj=new    D();
        obj.calculate();
    }
}