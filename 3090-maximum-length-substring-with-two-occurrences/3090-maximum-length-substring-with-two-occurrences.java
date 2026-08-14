class Solution {
    public int maximumLengthSubstring(String s) {
        int[] map = new int[26];
        int maxLen = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map[ch - 'a']++;
            while (map[ch - 'a'] > 2) {
                char leftChar = s.charAt(l);
                map[leftChar - 'a']--;
                l++;
            }
            maxLen = Math.max(maxLen, (i - l + 1));
        }

        return maxLen;
    }
}