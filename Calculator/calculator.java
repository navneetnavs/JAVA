import java.util.*;

public class calculator {
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the operands");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("enter the operation");
        char ch = in.next().charAt(0);
        switch(ch){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '%' : System.out.println(a%b);
            break;
            case '/' : System.out.println(a/b);
            break;
            default :
            System.out.println("Wrong Operator");
        }
    }
    
}
