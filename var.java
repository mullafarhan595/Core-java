class   var
{
    int  a;   //instance variable
    static int  b;   //class variable
    public static void main(String  []ar)
    {
        boolean  t=true;    //local variable
       var   obj=new  var();   //object  
       obj.a=55;
       var.b=74;
       System.out.println("Local Vari="+t);
       System.out.println("Instance Vari="+obj.a);
       System.out.println("Class vari="+var.b);

    }
}