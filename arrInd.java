class  arrInd
{
    public static void  main(String ar[])
    {
        int   x[]=new int[5];
      try
      {
        x[8]=50;
        System.out.println("Value="+x[2]);
      }
      catch(ArrayIndexOutOfBoundsException     e)
      {
        System.out.println("Array index is out of bounds..");
      }
    }
}