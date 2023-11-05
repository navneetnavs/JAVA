package Arrays.BinarySearch;
import java.util.*;
public class binary {
    public static int binarysearch(int arr[], int key){
        int start =0;
        int end = arr.length-1;
        int mid = (start+end)/2;
       while(start <=end){
        if(arr[key] == arr[mid])
        return mid;
        if (arr[key] > arr[mid]){
             start = mid+1;
        }
       
        else{
             end = mid -1;
        }
       
       }
      return -1;
    }
    public static void main(String args[]){
        int arr[]= {1,2,3,4,5,6,7,8,9};
        
        int key = 7;
        int index = binarysearch(arr, key);
        System.out.println("found at index"+index);
    }
}
