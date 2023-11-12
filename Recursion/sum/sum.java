package Recursion.sum;

public class sum {
    public static int sumn(int n){
        if(n==1){
            return 1;
        }
        int fnm1 = sumn(n-1);
        int fn = n + fnm1;
        return fn;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(sumn(n));
    }
}
