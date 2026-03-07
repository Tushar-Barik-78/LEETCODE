class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int [] ans = new int[n];

        int l=0;
        int r = n-1;
        int k = n-1;

        while(l<=r){
            int ls = nums[l]*nums[l];
            int rs = nums[r]*nums[r];
            if(ls < rs){
                ans[k--] = rs;
                r--;
            }else{
                ans[k--] = ls;
                l++;
            }
        }

        return ans;
    }
}