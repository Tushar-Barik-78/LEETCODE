class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int j = 0;
        int max = 0;
        int zc =0 ;

        while(j < n){
            if(nums[j] == 0){
                zc++;
            }

            while(zc > k){
                if(nums[i] == 0) zc--;
                i++;
            }

            if(zc <= k){
                max = Math.max(max, (j-i+1));
            }
            j++;
        }
        return max;
    }
}