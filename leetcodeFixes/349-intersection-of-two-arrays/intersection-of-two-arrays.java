class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums1){
            set.add(a);
        }

        List<Integer> res = new ArrayList<>();
        for(int b : nums2){
            if(set.contains(b)){
                res.add(b);
                set.remove(b);
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}