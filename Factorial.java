import java.util.Scanner;
public class Factorial
{
    static int n = 1;
    static Scanner sc= new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter the number : ");
        int n1= sc.nextInt();
        System.out.print(n1 +"!"+" = ");
        for(int i = n1; i>0; i--)
        {
            n*=i;
        }
        System.out.println(n);

    }
}
