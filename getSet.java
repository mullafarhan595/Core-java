class  getSet
{
    int  age;
    String  name;
    int getAge()
    {
        return(age);
    }
    String getName()
    {
        return(name);
    }
    void setAge(int  x)
    {
        age=x;
    }
    void  setName(String  nm)
    {
        name=nm;
    }
  public static void main(String ar[])
  {
        getSet  obj=new getSet();
        obj.setAge(25);  //CALL
        obj.setName("Sanjay");   //call
        int  x=obj.getAge();
        String  y=obj.getName();
        System.out.println("Age="+x);
        System.out.println("Name="+y);
  }
}