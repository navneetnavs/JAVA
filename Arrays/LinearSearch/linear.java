import java.util.*;
public class linear {
    public static int linearSearch(int arr[], int key){
        int l = arr.length;
        for(int i=0;i<=l;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int arr[] = {1,3,4,5,6,7,9,45,67,89};
        int key = 9;
        int index = linearSearch(arr, key);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found at index"+index); 
        }
       
    }
}