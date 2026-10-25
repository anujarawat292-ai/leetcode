class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> res = new HashSet<>();
        for(String w : words){
            int i = 0;
            StringBuilder s =  new StringBuilder();
            while(i<w.length()){
                s.append(code[w.charAt(i)-'a']);
                i++;
            }
            res.add(s.toString());
        }
        return res.size();
    }
}