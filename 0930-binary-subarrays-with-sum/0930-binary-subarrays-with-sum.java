class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMostK(nums,goal)-atMostK(nums,goal-1);
    }
    
    public int atMostK(int[] nums, int goal){
        if(goal<0)
            return 0;
        int i=0,j=0,sum=0,res=0;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>goal){
                sum-=nums[i];
                i++;
            }
            res+=j-i+1;
            j++;
        }
        return res;
    }
}