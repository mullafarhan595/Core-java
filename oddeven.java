public class oddeven {
    public static void main(String fm[])
    {
        int n = Integer.parseInt(fm[0]);
        int i, o = 0, e = 0;
        System.out.println("Even Numbers:");
        for(i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
                e += i;
            }
        }    
            System.out.println("Odd Numbers:");
            for(i = 1; i <= n; i++)
            {
                if(i % 2 != 0)
                {
                    System.out.println(i);
                    o += i;
                }
            }
             System.out.println("Sum of even numbers: " + e);
             System.out.println("Sum of odd numbers: " + o);
        }
       
    }
