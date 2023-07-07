class Solution {
    public int[] searchRange(int[] nums, int target) {
       int first=-1;
       int last = -1;
        
       first = lowerBound(nums,target);
        if(first==nums.length || target != nums[first]){
            int res[] ={-1,-1};
            return res;
        } else{
            last = upperBound(nums,target);
        }
          int res[] ={first,last-1};
        return res;
    }
    public int lowerBound(int [] nums, int target){
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
     public int upperBound(int [] nums, int target){
       int low=0,high=nums.length-1,mid=0,ans=nums.length;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
                ans=mid;
            } else{
                low=mid+1;
            }
        }
        return ans;
    }
}