class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int st = 0;
        int end = 0;
        int prod = 1;
        int ans = 0;
        while(end < nums.length){
            prod *= nums[end];
            while(prod>=k && st<=end){
                prod/=nums[st];
                st++;
            }
            ans+=(end-st+1);
            end++;
        }
        return ans;
    }
}