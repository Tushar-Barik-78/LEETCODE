class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int k = 0;
        for(int i : nums){
            if(i < pivot){
                ans[k++] = i;
            }
        }for(int i : nums){
            if(i == pivot){
                ans[k++] = i;
            }
        }for(int i : nums){
            if(i > pivot){
                ans[k++] = i;
            }
        }

        return ans;
    }
}