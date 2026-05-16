class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        
        for(int i=0;i<n;i++){
            if(i == 0) dp[i] = nums[i];
            else{
                int op1= nums[i] + ((i == 1)? 0 :dp[i-2]);
                int op2 = dp[i-1];
                dp[i] = Math.max(op1,op2);
            }
        }
        // System.out.println(Arrays.toString(dp));
        return dp[n-1];
    }
}