package Recursion.power;

public class power {
    public static int powertwo(int x,int n){
        if(n==0){
            return 1;
        }
        return powertwo(x, n-1)*x;
    }
    public static void main(String[] args) {
        System.out.println(powertwo(2,10));
    }
}
