class Solution {
    public String longestCommonPrefix(String[] strs) {
        int numStr = strs.length;

        for(int charM = 0 ; charM < strs[0].length(); charM++){
            for(int strN = 1; strN < numStr; strN++){
                if(strs[strN].length() <= charM || 
                    strs[strN].charAt(charM) != strs[0].charAt(charM)){
                        return strs[0].substring(0,charM);
                }
            }
        }
        return strs[0];
    }
}