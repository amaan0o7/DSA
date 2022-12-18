class Solution {
        public int minSubArrayLen(int s, int[] A) {
        int i=0,j=0,sum=0,res=Integer.MAX_VALUE;
            while(j<A.length){
                sum+=A[j];
                if(sum>=s){
                    // System.out.println("inside");
                    while(sum>=s){
                    sum-=A[i];
                    i++;
                }
                    res=Math.min(res,j-i+2);
                }
                
                j++;
            }
            return res!=Integer.MAX_VALUE?res:0;
    }
}