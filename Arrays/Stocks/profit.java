package Arrays.Stocks;

public class profit {
    public static int sellstock(int arr[]) {
       int maxprofit = 0;
       int buyprice = Integer.MAX_VALUE;
       for (int i=0;i<arr.length;i++){
        if(buyprice < arr[i]){
            int profit = arr[i] - buyprice;
            maxprofit = Math.max(maxprofit,profit);
        }
        else{
            buyprice = arr[i];
        }
        
       }return maxprofit;
    }
    public static void main(String args[]){
        int arr[] = {7,1,5,3,6,4};
        System.out.println(sellstock(arr));
    }
}
