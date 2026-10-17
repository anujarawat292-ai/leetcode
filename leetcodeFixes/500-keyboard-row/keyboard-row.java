class Solution {
    public String[] findWords(String[] words) {
        String tmp = "12210111011122000010020202";
        List<String> validWords = new ArrayList<>();
        for(String word : words){
            String str = word.toLowerCase();
            int targetRow = tmp.charAt(str.charAt(0)-'a');
            boolean valid = true;

            for(Character c :str.toCharArray()){
                if(tmp.charAt(c -'a') != targetRow){
                    valid = false;
                    break;
                }
            }

            if(valid){
                validWords.add(word);
            }
        }
        return validWords.toArray(new String[0]);
    }
}