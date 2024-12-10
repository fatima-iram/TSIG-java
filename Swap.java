import java.util.Scanner;
class Swap
{
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;
    public static void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping : ");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
    }
    public static void main(String args[])
    {
        System.out.println("Enter two numbers that need to be swapped : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Before swapping : ");
        System.out.println("a : " + n1);
        System.out.println("b : "+n2);
        swap(n1,n2);
    }
}