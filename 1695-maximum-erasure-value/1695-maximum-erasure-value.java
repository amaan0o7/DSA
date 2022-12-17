class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer>uniqueElements=new HashSet<>();
        int i=0,j=0,sum=0,res=0;
        while(j<nums.length){
            if(!uniqueElements.contains(nums[j])){
                sum+=nums[j];
                uniqueElements.add(nums[j]);
                // System.out.println("added = "+nums[j]+" sum="+sum);
            } else{
                while(uniqueElements.contains(nums[j])){
                    uniqueElements.remove(nums[i]);
                    sum-=nums[i];
                    // System.out.println("removed = "+nums[i]+" sum="+sum);
                    i++;
                }
                uniqueElements.add(nums[j]);
                sum+=nums[j];
            }
            
            res=Math.max(res,sum);
            // System.out.println("ans = "+res);
            j++;
        }
        return res;
    }
}