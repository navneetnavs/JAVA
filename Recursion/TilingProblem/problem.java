package Recursion.TilingProblem;

public class problem {
    public static int tiling(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fn1 = tiling(n-1);
        int fn2 = tiling(n-2);
        return fn1+fn2;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
