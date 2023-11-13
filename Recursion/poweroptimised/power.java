package Recursion.poweroptimised;

public class power {
    public static int powertwo(int x,int n){
        int halfpower = powertwo(x,n/2)*powertwo(x, n/2);
        if(n%2!=0){
         halfpower = x * halfpower;
        }
         return halfpower;
        }
    
    public static void main(String[] args) {
        System.out.println(powertwo(2,10));
    }
    
}
