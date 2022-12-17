class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    public int atMostK(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int res=0, i=0,j=0,n=nums.length;
        while(j<n){
            if(map.getOrDefault(nums[j], 0) == 0){
                k--;
            }
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            
            while( k<0){
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                if(map.get(nums[i]) == 0){
                k++;
                }
                i++;
            }
            res+=j-i+1;
            j++;
        }
        return res;
    }
}