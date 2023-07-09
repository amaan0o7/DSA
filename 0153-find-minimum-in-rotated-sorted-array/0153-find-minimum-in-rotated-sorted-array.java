class Solution {
    public int findMin(int[] nums) {
         int mid=0,high=nums.length-1,low=0,ans=Integer.MAX_VALUE;
        while(low<=high){
            mid=(high+low)/2;
             if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]);
                break;
            }

            if(nums[low]<=nums[mid]){
                 ans=Math.min(ans,nums[low]);
                    low=mid+1;
            } else{
                ans=Math.min(ans,nums[mid]);
                   high=mid-1;
            }
        }
        return ans;
    }
}