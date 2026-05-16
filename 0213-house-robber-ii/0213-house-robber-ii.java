class Solution {
     public static int robber21(int[] arr,int l, int r,int[] dp){
        if(l>r) return 0;
        if(l == r) return arr[l];
        if(dp[r] != -1) return dp[r];
        int op1 = arr[r] + robber21(arr,l,r-2,dp);
        int op2 = robber21(arr,l,r-1,dp);
        dp[r] = Math.max(op1,op2);
//        System.out.println(Arrays.toString(dp));
        return dp[r];
    }
    public int rob(int[] nums) {
        int n= nums.length;
        if(n == 1) return nums[n-1];
        if(n == 2) return Math.max(nums[0],nums[1]);
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        return Math.max(robber21(nums,0,n-2,dp1),robber21(nums,1,n-1,dp2));
    }
}