package BitManipulation.clearBit;

public class bit {
    public static int clearbit(int n, int i){
        int bitmask = 1 << i;
        int bitmask2 = ~(1 << i);
        return n & bitmask2;
    }
    public static void main (String args[]){
        System.out.println(clearbit(10,2));
    }
}
