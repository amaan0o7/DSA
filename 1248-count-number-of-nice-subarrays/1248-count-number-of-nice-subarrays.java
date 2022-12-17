class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int res=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            curr += nums[i]%2;
            if(map.containsKey(curr-k)){
                res+=map.get(curr-k);
            }
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return res;
    }
}