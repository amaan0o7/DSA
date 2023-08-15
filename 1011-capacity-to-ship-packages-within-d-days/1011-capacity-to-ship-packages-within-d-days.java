class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE,high=0;
        for(int weight:weights){
            high+=weight;
            low = Math.max(low, weight);
        }
        if(days==1) return high; 
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(calculateDays(weights,mid,days)){
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return low;
    }
    public Boolean calculateDays(int[] weights, int cap,int days) {
        int day=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                day+=1;
                load=weights[i];
            } else{
                load+=weights[i];
            }
        }
        return day<=days;
    }
}