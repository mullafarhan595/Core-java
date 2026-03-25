class finalDemo
{
    finalDemo()
    {
        System.out.println("Constructor..");
    }
    protected void finalize()
    {
        System.out.println("Object Destroy..");
    }
    public static void main(String []ar)
    {
       finalDemo obj=new finalDemo();  
       obj.finalize();
    }
}