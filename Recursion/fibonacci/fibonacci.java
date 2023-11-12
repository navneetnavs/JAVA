package Recursion.fibonacci;

public class fibonacci {
   public static int fib(int n){
    if( n==1 || n==0){
        return n;
    }
    int fnm = fib(n-1);
    int fnm2 = fib(n-2);
    return fnm + fnm2;
   }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
}
