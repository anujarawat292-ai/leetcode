class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int m = nums[nums.length -1];
        int totalMoves = 0;

        for(int n : nums){
            totalMoves += (m - n);
        }
        return totalMoves;
    }
}