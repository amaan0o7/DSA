class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if(threshold<nums.length)
            return -1;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        int low = 1, high = maxi;

        while(low<=high){
            int mid=(low+high)/2;
            if(calculateSum(nums,mid,threshold)){
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public Boolean calculateSum(int[] nums,int divisor, int threshold) {
        int sum=0;
        for(int num:nums){
            sum+=Math.ceil((double)(num) / (double)(divisor));
        }
        return sum<=threshold;
    }
}