class Solution {
    public int minLength(String s) {
        Stack<Character> stk = new Stack<>();
        for(Character c : s.toCharArray()){
            if(!stk.isEmpty() && 
                ((c.equals('B') && stk.peek().equals('A')) || (c.equals('D') && stk.peek().equals('C')))){
                    stk.pop();
            }else{
                stk.push(c);
            }
        }
        return stk.size();
    }
}