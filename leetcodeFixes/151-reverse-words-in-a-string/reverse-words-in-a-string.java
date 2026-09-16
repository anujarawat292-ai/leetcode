class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        String temp = "";
        s = s+" ";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                if(!temp.equals(""))
                {
                    ans.insert(0,temp+" "); 
                }
                 
                temp = "";
            }
            else
                temp += ch;
        }
       
        return ans.toString().substring(0,ans.length()-1);
    }
}