class Solution {
    public boolean canAliceWin(int n) {
        int stonesLeft = 10, count = 0;
        while(n >= stonesLeft){
            n -= stonesLeft;
            stonesLeft--;
            count++;
        }
        return count % 2 == 1;
    }
}