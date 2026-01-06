class Solution {
    public int[] applyOperations(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i] *=2;
                arr[i+1] = 0;
            }
        }

        int z = 0;
        
        for(int nz = 0; nz < n ; nz++){
            if(arr[z] != 0){
                z++;
            }else if(arr[z] == 0 && arr[nz] != 0){
                int t= arr[z];
                arr[z] = arr[nz];
                arr[nz] = t;
                z++;
            }
        }
        

        return arr;
    }
}