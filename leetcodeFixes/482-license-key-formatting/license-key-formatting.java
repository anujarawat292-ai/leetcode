class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int len = s.length();
        int d = (int)s.chars().filter(ch -> ch == '-').count();
        int alpha = len-d;
        int first = alpha % k;
        if(first == 0){
            first = k;
        }
        StringBuilder str = new StringBuilder();
        int cur =  first;
        int i =0;
        System.out.println("len"+len);
        for(char c : s.toCharArray()){
            i++;
            if(c == '-') continue;
            str.append(Character.toUpperCase(c));
            --cur;
            if(cur==0){
                System.out.println("1"+c);
                 System.out.println("i"+i);
                cur = k;
                if(i < len){
                    System.out.println(c);
                    str.append('-');
                }
            }
        }
        if(str.length()>0 && str.charAt(str.length() -1)=='-'){
            str.deleteCharAt(str.length()-1);
        }
        return str.toString();
    }
}