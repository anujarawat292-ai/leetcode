class Solution {
    public int longestConsecutive(int[] input) {
     Arrays.sort(input);
     int maxLength =0;
     HashMap<Integer,Integer> map = new HashMap<>();
     if(input.length == 1){
        return 1;
     }else{
     for(Integer n: input){
          if(map.containsKey(n-1)){
               map.put(n,map.get(n-1)+1);
               if(maxLength < map.get(n)){
                    maxLength = map.get(n);
               }
          }else{
                map.putIfAbsent(n,1);
                if(maxLength < map.get(n)){
                    maxLength = map.get(n);
                }
               }
     }}
        return maxLength;    
    }
}