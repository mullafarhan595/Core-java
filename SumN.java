public class SumN {
    public static void main(String fm[])
    {
      int n=Integer.parseInt(fm[0]);
      int i=1,s=0;
      while(i<=n)
      {
        s=s+i;
        i++;
        }
        System.out.println("sum of first n Numbers:"+s);
        
    }

}
