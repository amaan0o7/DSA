//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.characterReplacement(s, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int characterReplacement(String s, int k)
    {
        int res=0;
        for(int i=65;i<=90;i++){
            res=Math.max(res,findMaxSubArray(s,k,(char)i));
        }
        return res;
    }
    public int findMaxSubArray(String s, int k,char curr){
        int i=0,j=0,max=0,count=0;
        char arr[]=s.toCharArray();
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