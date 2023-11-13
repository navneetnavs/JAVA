package Recursion.LastOccurence;

public class last {
    public static int lastocc(int arr[], int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastocc(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,6,8};
        System.out.println(lastocc(arr,6,0));
    }
}
