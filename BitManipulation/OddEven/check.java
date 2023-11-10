package BitManipulation.OddEven;

public class check {
       public static void odd(int n) {
        int bit = 1;
        if((n & bit) == 0)
        {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Not Even Number");
        }
    }
        public static void main (String args[]){
        int n = 5;
        odd(n);
        
       }
    }

