class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<words.length;i++){
            str.append(words[i]);
            if(s.equals(str.toString())){
                return true;
            }
        }
        return false;
    }
}