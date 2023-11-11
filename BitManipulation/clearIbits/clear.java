package BitManipulation.clearIbits;

public class clear {
    public static int clearIbits (int n,int i){
        int bitmask = ~0 << i;
        return n & bitmask;
    }
    public static void main (String args[]){
        System.out.println(clearIbits(10,2));
    }
}
