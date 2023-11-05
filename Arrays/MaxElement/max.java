package Arrays.MaxElement;

import java.util.Scanner;

public class max {
    public static void main (String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,67,5};
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max ELement of array:"+max);
    }
}
