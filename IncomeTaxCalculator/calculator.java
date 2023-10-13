import java.util.*;

public class calculator {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Papa ki Income");
        int n = in.nextInt();
        if (n < 500000)
        {
            System.out.println("No Tax");
        }
        else if (500000 <= n || n <= 1000000)
        {
            System.out.println("20% Tax");
        }
        else if (n >= 1000000){
            System.out.println("30% tax");
        }

    }
    
}
