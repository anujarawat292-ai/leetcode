class Solution {
    public int[] countBits(int n) {
         int[] ans = new int[n+1];
        for(int k=0; k<ans.length; ++k){
        int i =0;
        int z =k;
        int count =0;
        if(k == 0){
            ans[k] =0;
        }else{
            while(i<=32){
                if((z & 1) == 1){
                    ++count;
                }
                z = z >> 1;
                ++i;
            }
            ans[k] = count;
        }
        }
    return ans;
    }
}