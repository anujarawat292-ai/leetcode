class Solution {
    public void moveZeroes(int[] nums) {
        int l =0 ,r=0;

        while(r<nums.length){
            if(l==r){
             if(nums[l]!=0) {
                l++;
                r++;
                }else{
                    r++;
                }
                continue;
            }
            if(nums[r] != 0){
                nums[l] = nums[r];
                nums[r] = 0;
                l++;
            }
            r++;
       }
    }
}