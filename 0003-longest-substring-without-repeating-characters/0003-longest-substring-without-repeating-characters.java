class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0;

        for(j=0;j<n;j++){
            char ch = s.charAt(j);
            if(map.get(ch) != null){
                i = Math.max(map.get(ch)+1 ,i);

            }
            map.put(ch, j);
            len = Math.max(len,(j-i+1));

        }
        return len;
    }
}