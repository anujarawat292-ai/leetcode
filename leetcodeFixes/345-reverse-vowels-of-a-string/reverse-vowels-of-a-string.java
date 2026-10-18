class Solution {
    public String reverseVowels(String s) {
        List<Character> v = Arrays.asList('A','E','I','O','U','a','e','i','o','u');
        char[] c = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(v.contains(c[i]) && v.contains(c[j])){
                char t = c[i];
                c[i] = c[j];
                c[j] = t;
                i++;
                j--;
            }else if(v.contains(c[i]) && !v.contains(c[j])){
                j--;
            }else if(!v.contains(c[i]) && v.contains(c[j])){
                i++;
            }else{
                i++;
                j--;
            }
        }
        return String.valueOf(c);
    }
}