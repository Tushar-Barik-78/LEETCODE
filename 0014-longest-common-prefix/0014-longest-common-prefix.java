class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (String s : strs) {
            min = Math.min(min, s.length());
        }
        int n = strs.length;
        String ans = "";
        boolean flag = true;
        for (int i = 0; i < min; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (ch != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans += ch;
            } else {
                break;
            }
        }

        return ans;
    }
}