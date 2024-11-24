public class rotateArray {
    public static void rotate(int []nums, int k){
        // while(k>0){
        //     int temp = nums[nums.length-1];    
        //     for(int i = nums.length-2; i >= 0 ; i--){
        //         nums[i+1] = nums[i];
        //     }
        //     nums[0] = temp;
        //     k--;
        // }

        k %= nums.length;
        int temp, begin;
        for(int start = 0; start < k; start++){
            begin = nums[nums.length-1];
            for(int j = 0; j < nums.length; j++){
                temp = nums[j];
                nums[j] = begin;
                begin = temp;
            }
        }
        System.out.println("Rotated array: --");
        for(int n : nums){
            System.out.print(n +" ");
        }

    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray r =new rotateArray();
        r.rotate(nums, k);
    }
    
}
