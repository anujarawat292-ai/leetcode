class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;
        Map<Character, String> mapP = new HashMap<>();
        Map<String, Character> mapS = new HashMap<>();
        for(int i =0 ; i < pattern.length(); i++){
            String resP = mapP.putIfAbsent(pattern.charAt(i),str[i]);
            Character resS = mapS.putIfAbsent(str[i],pattern.charAt(i));
            if( (resP != null && !resP.equals(str[i]))
                || (resS != null && !resS.equals(pattern.charAt(i)))) return false;
        }
        return true;
    }
}