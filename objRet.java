class   objRet
{
    int     roll;
    String  name;
  objRet  get()
    {
        roll=5;
        name="Kiran";
        return(this);   //that returns object
    }
  void  show(objRet   p)
  {
      System.out.println("ROll="+p.roll);
      System.out.println("Name="+p.name);
  }
  public static void main(String  ar[])
  {
    objRet   obj=new objRet();
    objRet   x=new  objRet();
    x=obj.get();
    obj.show(x);
  }
}