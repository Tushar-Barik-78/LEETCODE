class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen = 0; 
        int l =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch) > 2){
                char leftChar = s.charAt(l);
                map.put(leftChar,map.getOrDefault(leftChar,0)-1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                l++;
            }
            maxLen = Math.max(maxLen,(i-l+1));
        }

        return maxLen;
    }
}