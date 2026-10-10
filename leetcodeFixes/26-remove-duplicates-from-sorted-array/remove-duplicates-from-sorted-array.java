class Solution {
    public int removeDuplicates(int[] nums) {
        int count =1;
      nums[count-1] = nums[0];
      if(nums.length == 1){
        return count;
      }else{
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[count]=nums[i+1];
                count++;}
                  }
            }
        return count;
    }
}