abstract  class    base
{
    abstract  void docal(double  x);
}
class   sqr   extends   base
{
    double  z;
    void   docal(double  x)
    {
       z=x*x; 
       System.out.println("Square="+z);
    }
}
class   sqroot   extends   base
{
    double  z;
    void docal(double  x)
    {
        z=Math.sqrt(x);
        System.out.println("Square Root="+z);
    }
}
class    absDemo
{
    public static void main(String   a[])
    {
        sqr   p=new   sqr();
        p.docal(45.5);
        sqroot  q=new  sqroot();
        q.docal(81.0);
    }
}