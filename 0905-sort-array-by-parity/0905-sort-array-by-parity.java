class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            while((i<j) && arr[i]%2 == 0) i++;
            while((i<j) && arr[j]%2 != 0) j--;

            if((arr[i]%2 ==1) && (arr[j]%2 == 0)){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

        }

        return arr;
    }
}