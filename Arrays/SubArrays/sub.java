package Arrays.SubArrays;

public class sub {
    public static void main (String args[]){
        int arr[] = {1,2,3,4,5,6};
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for (int j=i+1; j<arr.length; j++)
            {
                int ncurr = arr[j];
                for(int k=curr; k<=ncurr; k++){
                    int intel = arr[k];
                    System.out.print(intel);
                }
                System.out.println();
}
System.out.println();
        }
    }
}
