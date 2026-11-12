class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1) return 1;

        int max = 1, maxA = 1, maxD = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                ++maxA;
                maxD = 1;
                if(max < maxA) max = maxA;
            }else if(nums[i] < nums[i-1]){
                ++maxD;
                maxA = 1;
                if(max < maxD) max = maxD;
            }else{
                maxA = 1;
                maxD = 1;
            }
        }
        return max;
    }
}