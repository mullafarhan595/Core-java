	class	one
	{
		void   get()
		{
            System.out.println("I am in one class");
		}
	}	
	class	two   extends   one
	{
		void   get()
		{
             System.out.println("I am in two class");
		}
	}
class   three   extends   one
{
         void   get()
		{
             System.out.println("I am in three class");
		}
}
class  dynamic
{
   public static void main(String  ar[])
  {
     one    a=new    one();
     two    b=new   two();
     three  c=new   three();
     one      z;   //reference
     z=a;  //ref  z referce object a
	 a.get();
	 z=b;   //ref  z referce object b
	 z.get();
	 z=c;   //ref  z referce object c	
	 z.get();  
  }
}





