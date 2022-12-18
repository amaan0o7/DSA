class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0,j=0,sum=0,res=0;
        while(j<s.length()){
            sum+=Math.abs((int)s.charAt(j)-(int)t.charAt(j));
            // System.out.println("sum ="+sum+" char in s= "+s.charAt(j)+" char in t= "+t.charAt(j)+" j="+j);
            while(sum>maxCost){
                sum-=Math.abs((int)s.charAt(i)-(int)t.charAt(i));
                // System.out.println("sum ="+sum+" char in s= "+s.charAt(i)+" char in t= "+t.charAt(i)+" i="+i);
                i++;
            }
            res=Math.max(res,j-i+1);
            // System.out.println("res ="+res);
            j++;
        }
        return res;
    }
}