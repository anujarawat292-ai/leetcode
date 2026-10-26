class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map =  new HashMap<>();
        for(int i=0; i<list1.length; i++){
            map.put(list1[i], i);
        }

        List<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
               int curmin = i + map.get(list2[i]);
                if(curmin < min){
                    min = curmin;
                    res.clear();
                    res.add(list2[i]);
                }
                else if(curmin == min){
                    res.add(list2[i]);
                }
            }
        }

        return res.toArray(new String[0]);
    }
}