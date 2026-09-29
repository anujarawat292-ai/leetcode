class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk =  new Stack<>();
        for(Character c : s.toCharArray()){
            if(Character.isDigit(c)){
                if(!stk.isEmpty()) stk.pop();
            }else{
                stk.push(c);
            }
        }
        if(!stk.isEmpty()){
            StringBuilder str = new StringBuilder();
            while(!stk.isEmpty()){
                str.append(stk.pop());
            }
            return str.reverse().toString();
        }
        return "";
    }
}