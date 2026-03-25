class   cntObj
{
    static  int   cnt;
    cntObj()
    {
        cnt++;
    }
    static void  show()
    {
        System.out.println("Total Objects="+cnt);
    }
    public  static void  main(String  []ar)
    {
        cntObj    a=new  cntObj();
        cntObj    b=new  cntObj();
        cntObj    c=new  cntObj();
        cntObj    d=new  cntObj();
        cntObj.show();
    }

}