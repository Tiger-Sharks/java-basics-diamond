import java.util.*;
public class diamond
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        diamond(n);
    }
    public static void diamond(int n)
    {
        //1st half
        for(int i=1;i<=n;i++)
        {
            //spaces 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" hi");
            }
            //stars
            for(int k=1;k<=((2*i)-1);k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--)
        {
            //spaces 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=((2*i)-1);k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        
    }
}
