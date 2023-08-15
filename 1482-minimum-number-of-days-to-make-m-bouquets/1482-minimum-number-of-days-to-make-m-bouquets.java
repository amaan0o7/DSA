class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        int n = bloomDay.length; // Size of the array
        if (val > n) return -1;
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE,mid=0;
        for(int day:bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        while(low<=high){
            mid=low+(high-low)/2;
            if(countBouquets(bloomDay,mid,m,k))
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
    public Boolean countBouquets(int[] bloomDay, int days, int k,int m) {
        int count=0,noOfBouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=days){
                count++;
            } else{
                noOfBouquets+=(count/m);
                count=0;
            }
        }
        noOfBouquets+=(count/m);
        return noOfBouquets>=k;
    }
}