package Recursion.FirstOccurance;

import java.nio.file.SecureDirectoryStream;

public class first {
    public static int firstocc(int arr[],int key, int i){
        if(arr[i]== key){
            return i;
        }
        return firstocc(arr,key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,23,4,5,6,6,7,8,9};
        System.out.println(firstocc(arr,8,0));
    }
}
