class Name
{
    public static void main(String fm[])
    {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter name: ");
        String a = sc.next();
        System.out.print("Enter name: ");
        String b = sc.next();
        String c = a + b;
        System.out.println(" Loves :" + c);
        sc.close();

    } 
}