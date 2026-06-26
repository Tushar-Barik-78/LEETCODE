class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;

        int max = Math.max(0,gain[0]);
        for(int i=1;i<n;i++){
            gain[i] += gain[i-1];
            max = Math.max(gain[i],max);
        }

        // for(int i = 0;i< n;i++){
        //     ans = Math.max(gain[i],ans);
        // }

        return max;
    }
}