class Solution {
    public int minimumPushes(String word) {
        int  n = word.length();
        int ans = 0;
        int freq = 1;

        while(n>0){
            ans += freq * Math.min(8,n);
            n -= 8;
            freq++;
        }


        return ans;
    }
}