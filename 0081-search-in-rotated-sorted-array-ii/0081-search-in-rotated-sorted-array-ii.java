class Solution {
    public boolean search(int[] nums, int target) {
        int mid=0,high=nums.length-1,low=0;
        while(low<=high){
            mid=(high+low)/2;
            if(nums[mid]==target){
                return true;
            } 
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>=target ){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            } else{
                if(nums[mid]<=target && nums[high]>=target ){
                    low=mid+1; 
                }else{
                   high=mid-1;
                }
            }
        }
        return false;
    }
}