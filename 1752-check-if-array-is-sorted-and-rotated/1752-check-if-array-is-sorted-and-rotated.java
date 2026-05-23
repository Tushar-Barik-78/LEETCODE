class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int tol = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                tol++;
                // if(tol == 2){
                //     return false;
                // }
            }
        }
        // if(nums[0]<nums[n-1] && tol == 1){
        //     return false;
        // }

        return (tol <= 1);
    }
}