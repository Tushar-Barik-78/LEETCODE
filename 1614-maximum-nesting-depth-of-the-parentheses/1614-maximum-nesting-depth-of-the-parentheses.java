class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int o = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                o++;
            }else if(ch== ')'){
                o--;
            }
            max = Math.max(max,o);
        }

        return max;
    }
}