class Solution {
    public int shortestSubarray(int[] nums, int k) {
       long n = nums.length, sum=0,res= Long.MAX_VALUE;
        Deque<Pair<Long, Integer>> monoStore = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>=k){
                res= Math.min(res,i+1);
            }
            
            Pair<Long,Integer> curr = new Pair<>(Long.MIN_VALUE,Integer.MIN_VALUE);
            while(!monoStore.isEmpty() && sum-monoStore.peekLast().getKey()>=k){
                curr=monoStore.pollLast();
            }
            if(curr.getKey()!=Long.MIN_VALUE){
                res=Math.min(res,i-curr.getValue());
            }
            while(!monoStore.isEmpty() && monoStore.peekFirst().getKey()>=sum){
                monoStore.pollFirst();
            }
            monoStore.offerFirst(new Pair<>((long)sum,i));
        }
        return res!=Long.MAX_VALUE?(int)res:-1;
    }
}