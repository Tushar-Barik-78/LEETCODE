class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int zc = 0;
        int max = 0;
        while(j<n){
            if(nums[j] == 0){
                zc++;
            }
            while(zc > 1){
                if(nums[i] == 0){
                    zc--;
                }
                i++;
            }

            max = Math.max(max,(j-i+1));
            j++;
        }


        return max-1;
    }
}