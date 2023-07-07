class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1,mid=0,ans=nums.length;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>=target){
                high=mid-1;
                ans=mid;
            } else{
                low=mid+1;
            }
        }
        return ans;
    }
}