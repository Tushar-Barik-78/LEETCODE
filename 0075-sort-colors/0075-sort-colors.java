class Solution {

    public static void swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public void sortColors(int[] nums) {
        int i=0;
        int j = 0;
        int k = nums.length-1;

        while(j<=k){
            if(nums[j] == 2){
                swap(nums,j,k);
                // j++;
                k--;
            }else if(nums[j] == 0){
                swap(nums,i,j);
                i++;
                j++;
            }else{
                j++;
            }
        }
    }
}