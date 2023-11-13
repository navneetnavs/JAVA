package Recursion.IsArraySorted;

public class array {
     public static boolean isarraysort(int arr[], int i){
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isarraysort(arr,i+1);
     }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(isarraysort(arr,0));
    }
}
