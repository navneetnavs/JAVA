package BitManipulation.updatebit;

public interface bit {
    public static int setbit(int n,int i)
    {
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearbit(int n, int i){
        int bitmask = 1 << i;
        int bitmask2 = ~(1 << i);
        return n & bitmask2;
    }
    public static int updatebit (int n, int i, int newbit){
            if(newbit == 0){
                return  clearbit(n, i);
            }
            else{
                return setbit(n,i);
            }
    }
    public static void main (String args[]){
        System.out.println(updatebit(10,2,0));
    }
}
