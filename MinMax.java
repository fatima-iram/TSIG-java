import java.util.Scanner;
public class MinMax
{
    static Scanner sc = new Scanner(System.in);
    static int max,min,i;
    public static void main(String[] args)
    {
        System.out.print("Enter the number of elements in the array : ");
        int n1=sc.nextInt();
        System.out.println("Enter "+n1+" elements for the array : ");
        int[] n = new int[n1];
        for(int i=0;i<n1;i++)
        {
            n[i]=sc.nextInt();
        }
        for(i=0;i<n1;i++)
        {
            if(n[i]>max)
                max++;
            if(n[i]<min)
                min++;
        }
        System.out.println("The maximum number in the array : "+max);
        System.out.println("The minimum number in the array : "+min);
    }
}
