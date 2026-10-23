class Solution {
    public List<String> summaryRanges(int[] nums) {
        int l = 0;
        int r = 1;
        List<String> list = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
            if(nums[r]-nums[i] != 1){
                if(l==i){
                    list.add(String.valueOf(nums[l]));
                }else{
                    list.add(String.valueOf(nums[l])+"->"+String.valueOf(nums[i]));
                }
                l=r;
                r++;
                continue;
            }
            r++;
        }
        if(r==nums.length){
            if(r-l>1){
              list.add(String.valueOf(nums[l])+"->"+String.valueOf(nums[r-1]));
            }else{
              list.add(String.valueOf(nums[r-1]));
            }
            }
        return list;
    }
}