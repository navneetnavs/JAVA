import java.util.*;
public class solid {
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(" ");
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}