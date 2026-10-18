class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i =0; i<s.length(); i++){
            char sv = s.charAt(i);
            char tv = t.charAt(i);
            if((mapS.containsKey(sv) && mapS.get(sv) != tv) ||
             (mapT.containsKey(tv) && mapT.get(tv) != sv)){
                return false;
            }
             mapS.put(sv,tv);     
             mapT.put(tv,sv);   
        }
        return true;
    }
}