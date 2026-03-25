class   Pat1
{
    int i,j;
    int  k=65;   //Ist attempt
    void show()
    {
        for(i=1;i<=5;i++)  //lines
        {
            for(j=65;j<=k;j++)   //logic
            {
                System.out.print((char)j+" ");
            }
            k++;   //IInd attempt
            System.out.println();
        }
    }
    public static void main(String []ar)
    {
        Pat1   obj=new Pat1();
        obj.show();  
    }
}