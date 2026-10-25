class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashSet<String> res = new HashSet<>();
        String[] arrS1 = s1.split(" ");
        String[] arrS2 = s2.split(" ");
        HashMap<String,String> map = new HashMap<>();
        for(String s : arrS1){
            if(map.containsKey(s)){
                res.remove(s);
            }else{
                res.add(s);
                map.put(s,"");
            }
        }
        for(String s : arrS2){
            if(map.containsKey(s)){
                res.remove(s);
            }else{
                res.add(s);
                map.put(s,"");
            }
        }
        return res.toArray(new String[0]);
    }
}