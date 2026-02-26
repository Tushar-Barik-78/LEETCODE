class Solution {
    public int pivotIndex(int[] arr) {
        int sum = 0;
        for(int i:arr){
            sum += i;
        }

        int left = 0;
        for(int i=0;i<arr.length;i++){
            left += (i==0) ? 0 : arr[i-1];
            int right = sum - left - arr[i];
            if(left == right){
                return i;
            }
        }


        return -1;
    }
}