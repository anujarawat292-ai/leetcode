class Solution {
    public String reverseOnlyLetters(String s) {
        int l = 0, r = s.length()-1;
        char[] str = s.toCharArray();
        while(l < r){
            if(!Character.isLetter(str[l])) l++;
            if(!Character.isLetter(str[r])) r--;
            if(Character.isLetter(str[l]) && Character.isLetter(str[r])){
                char c = str[l];
                str[l] = str[r];
                str[r] = c;
                l++;
                r--;
            }
        }
        return new String(str);
    }
}