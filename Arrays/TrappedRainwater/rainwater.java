package Arrays.TrappedRainwater;

public class rainwater {
    public static int rainwaters(int arr[]){
        int l = arr.length;
        int leftmax [] = new int [l];
        leftmax[0] = arr[0];
        for (int i=1;i<l;i++){
            leftmax[i] = Math.max(arr[i],leftmax[i-1]);
        }
        int rightmax[] = new int [l];
        rightmax[l-1] = arr[l-1];
        for(int i=l-2; i>=0; i--){
            rightmax[i] = Math.max(arr[i], rightmax[i+1]);
        }
        int trappedwater = 0;
        for(int i=0; i<l;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater = trappedwater + (waterlevel - arr[i]);
        }
        return trappedwater;

    }
    public static void main(String args[]){
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(rainwaters(arr));
    }
}
