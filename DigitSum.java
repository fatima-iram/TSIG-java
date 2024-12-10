import java.util.Scanner;

public class DigitSum 
{
    public static void main(String[] args)
    {
        int g=0;
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter the number : ");
            int n1= sc.nextInt();
            while(n1!=0)
            {
                int rem = n1%10;
                g = g + rem;
                n1/=10;
            }
        }   
        
        System.out.print("The addition of the given digits of a number = ");
        System.out.println(g);
    }
}
