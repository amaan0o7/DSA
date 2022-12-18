class Solution {
    public int characterReplacement(String s, int k) {
        int res=0;
        for(int i=65;i<=90;i++){
            res= Math.max(res,findMaxSubArray(s.toCharArray(),k,(char)i));
        }
        return res;
    }
    public int findMaxSubArray(char[] arr, int k, char curr) {
        int i=0,j=0,max=0;
        while(j<arr.length){
            if(arr[j]!=curr){
                k--;
            }
            while(k<0){
                if(arr[i]!=curr){
                    k++;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}