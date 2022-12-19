class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length==0 || fruits.length==1)
            return fruits.length;
        Map<Integer,Integer> map = new HashMap<>();
        int i=0,j=0,max=0,unique=0;
        while(j< fruits.length){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            unique=map.size();
            if(unique<2){
                j++;
            }
            else if( unique == 2){
                max=Math.max(max,j-i+1);
                j++;
            } else if(unique>2){
                while(i<j && unique>2){
                    map.put(fruits[i],map.get(fruits[i])-1);
                    if(map.get(fruits[i])==0){
                        map.remove(fruits[i]);
                        unique--;
                    }
                    i++;
                }
                j++;
            }
        }
        if(max==0){
            return fruits.length;
        }
        return max;
    }
}