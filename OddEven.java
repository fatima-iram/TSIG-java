import java.util.Scanner;

public class OddEven
{ 
    static int even=0;
    static int odd=0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter a number : ");
        int n1= sc.nextInt();
        System.out.print("The entered number is : ");
        System.out.println(n1);
        while(n1 != 0)
        {
            int rem = n1%10;
            n1/=10;
            if(rem%2==0)
                even++;
            else 
                odd++;
        }
        System.out.print("The even digits in the number is : ");
        System.out.println(even);
        System.out.print("The odd digits in the number is :  ");
        System.out.println(odd);
    }
}
