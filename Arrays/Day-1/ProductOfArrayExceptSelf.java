class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] output_arr = new int[nums.length];

        output_arr[0] = 1;
        for(int i=1; i<nums.length; i++){
            output_arr[i] = output_arr[i-1] * nums[i-1];
        }

        int rightProduct = 1;
        for(int i= nums.length-1; i>=0; i--){
            output_arr[i] = output_arr[i]*rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return  output_arr;
        
    }
}