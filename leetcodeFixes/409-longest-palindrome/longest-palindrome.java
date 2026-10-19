class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        for(Character c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)%2 == 0){
                res += 2;
            }
        }
        return res + (res<s.length()?1:0);
    }
}