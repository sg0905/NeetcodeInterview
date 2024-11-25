public class maxProfit {
    public int sol(int ar[]){
        int max = 0;
        for(int i = 0 ; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[i] > ar[j]){
                    continue;
                }
                else{
                    if(max < (ar[j] - ar[i]))
                        max = ar[j]- ar[i];
                }
            }
        }
        return max;

    }
    public static void main(String args[]){
        int ar [] = {7,1,5,3,6,4};
        maxProfit m= new maxProfit();
        System.out.println("Maximum Profit: "+ m.sol(ar));


        int arr [] = {7,6,4,3,1};
        System.out.println("Maximum Profit: "+ m.sol(arr));
    }
    
}
