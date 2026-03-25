class   Prime
{
    public static void main(String   ar[])
    {
        int   n=Integer.parseInt(ar[0]);
        int   i=1,cnt=0;

        while(i<=n)
        {
            if(n%i==0)
            {
                cnt++;
            }
            i++;
        }

        if(cnt==2)
            System.out.println(n+" Is Prime");
        else
            System.out.println(n+" Is NOT Prime");
    }
}