class Solution {
    public int search(int[] nums, int target) {
      //sol 1  
//         int len=nums.length;
        
//         int low=0;
//         int high=len-1;
//         while(low<high){
//             int mid=(low+high)/2;
//              if(nums[mid]>nums[high])
//                 low=mid+1;
//             else
//                 high=mid;
//         }
//         int rotate=low;
//         low=0;
//         high=len-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             int realMid=(mid+rotate)%len;
            
//             if(nums[realMid]==target)
//                 return realMid;
//             else if(nums[realMid]<target)
//                 low=mid+1;
//             else
//                 high=mid-1;
//         }
//         return -1;
        

        //sol 2
      int ans=-1,low=0,high=nums.length-1 ,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            } else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>=target){
                    high=mid-1;
                } else{
                    low=mid+1;
                }
            } else{
                 if(nums[mid]<=target && nums[high]>=target){
                     low=mid+1;
                } else{
                   high=mid-1;
                }
            }
        }
        return ans;
    
    }
}