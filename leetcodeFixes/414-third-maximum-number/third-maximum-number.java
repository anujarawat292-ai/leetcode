class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> st = new TreeSet<>();
        for(int a : nums){
            st.add(a);
        }
        int n = st.size();
        if(n>2){
            st.pollLast();
            st.pollLast();   
        }
        return st.pollLast();
    }
}