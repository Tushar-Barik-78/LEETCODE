class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] lm = new int[n];
        lm[0] = arr[0];
        for(int i=1;i<n;i++){
            lm[i] = Math.max(lm[i-1],arr[i]);
        }

        int[] rm = new int[n];
        rm[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rm[i] = Math.max(rm[i+1],arr[i]);
        }

        int sum = 0;
        for(int i=0;i<n;i++){
            sum += Math.min(lm[i],rm[i]) - arr[i];
        }


        return sum;

    }
}