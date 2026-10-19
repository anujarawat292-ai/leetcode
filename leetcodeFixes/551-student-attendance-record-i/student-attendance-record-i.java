class Solution {
    public boolean checkRecord(String s) {
        int A = 0;
        int L = 0;
        int i = 0;
        boolean t =false;
        for(char c : s.toCharArray()){
             if(c == 'A') ++A;
            if(c == 'L') {
                ++L;
                if(L>=3 && s.charAt(i-1)=='L' && s.charAt(i-2)=='L'){
                    t = true;
                }
            }
            i++;
            if(A>1 || (L>2 && t)) return false;
        }
        return true;
    }
}