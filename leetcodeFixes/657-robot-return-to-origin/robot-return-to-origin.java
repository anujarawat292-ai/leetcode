class Solution {
    public boolean judgeCircle(String moves) {
        int originX = 0;
        int originY = 0;
        for(Character c : moves.toCharArray()){
            switch(c){
                case 'U': originY++;
                        break;
                case 'D': originY--;
                        break;
                case 'R': originX++;
                        break;
                case 'L': originX--;
                        break;
                default:
                        break;
            }
        }

        return originX == 0 && originY == 0;
    }
}