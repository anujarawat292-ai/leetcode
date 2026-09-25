class Solution {
    public String longestCommonPrefix(String[] strs) {
        int numStr = strs.length;
        if(numStr == 0) return "";
        if(numStr == 1 || strs[0].equals("")) return strs[0];
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[numStr-1];
        int i =0;
        while(i<f.length() && f.charAt(i) == l.charAt(i)){
            i++;
        }
        return f.substring(0,i);
    }
}