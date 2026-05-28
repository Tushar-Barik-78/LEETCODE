class Solution {
    public int removeDuplicates(int[] nums) {
        int test =  nums[0];
        int j = 1;
        for(int i=1;i<nums.length;i++){
            if(test != nums[i]){
                test = nums[i];
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }


        }


        return j;
    }
}