class Solution {
    public int lengthOfLongestSubstring(String s) {
      if(s.length() == 0) return 0;
      int maxlen = 1;
      char[] arr = s.toCharArray();
      String prev = String.valueOf(s.charAt(0));

      for(int i=1; i<arr.length; i++){
            if(prev.contains(String.valueOf(arr[i]))){
                prev = prev.substring(prev.indexOf(arr[i])+1);
            }
            prev = prev+ String.valueOf(arr[i]);
            if(maxlen < prev.length()){
                maxlen = prev.length();
            }
      }
        
      return maxlen;
    }
}