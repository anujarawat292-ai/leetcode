class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String newS = s+s;
        String trimS = newS.substring(1,newS.length()-1);
        return trimS.contains(s);
    }
}