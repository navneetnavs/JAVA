package Arrays.Kadane;
// Kadane's Algorithm
public class MaxSum {
    public static void main (String args[]){
        int arr[] = {1,2,3,4,56,7,-9,-7,-45};
        int cs =0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];
            if(cs <0){
                cs =0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our Max Value"+ms);
    }
}
