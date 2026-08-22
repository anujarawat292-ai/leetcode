class Solution {
    public boolean isValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stk.push(c);
            }else {
                if(stk.isEmpty() ||
                        (c == ')' && !stk.peek().equals('(')) ||
                        (c == '}' && !stk.peek().equals('{')) ||
                        (c == ']' && !stk.peek().equals('['))){
                    return false;
                }
                stk.pop();
            }
        }
        return stk.isEmpty();
    }
}