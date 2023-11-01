import java.util.*;

public class binomial {
    static int factorial(int n){
        int fact = 1;
        for ( int i=n;i>=1; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int bcoefficient(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r); 

        int bincoefficient = fact_n / (fact_r * fact_nmr);
        return bincoefficient;
    }
    public static void main (String args[]){
        System.out.println(bcoefficient(5,4));
    }
}    

