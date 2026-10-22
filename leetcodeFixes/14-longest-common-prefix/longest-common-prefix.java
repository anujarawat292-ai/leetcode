class Solution {
    public String longestCommonPrefix(String[] strs) {
        int numStr = strs.length;
        Arrays.sort(strs);
        //String f = strs[0];
        String l = strs[numStr-1];
        int i =0;
        while(i<strs[0].length() && strs[0].charAt(i) == l.charAt(i)){
            i++;
        }
        return strs[0].substring(0,i);
    }
}