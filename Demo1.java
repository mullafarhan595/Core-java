class   student
{

}
class  Demo1
{
    public static void main(String ar[])
    {
        boolean  res;
        student   obj=new  student();
        res= obj instanceof student;
        if(res==true)
           System.out.println("Created object belongs to student class");
        else
          System.out.println("Created object NOT belongs to student class");

    }
}