class Solution {
    public int maxProduct(int n) {
        // int max = 0;
        // int smax = 0;
        // int[] arr = new int[10];

        // while(n>0){
        //     int rem = n%10;
        //     arr[rem]++;
        //     n /= 10;    
        // }

        // for(int i=9;i>=0;i++){
        //     if(max == 0 && arr[i] >= 2){
        //         max = arr[i];
        //         smax = arr[i];
        //         break;
        //     }
        //     if(max==0 && arr[i] == 1){
        //         max = arr[i];
        //     }
        //     if(max !=0 && arr[i]== 1){
        //         smax = arr[]
        //     }
        // }
        int max1 = -1 , max2 = -1;
        while(n != 0){
            int rem = n % 10;
            if(max1 <= rem){
                max2 = max1;
                max1 = rem;
            }
            else if(max2 < rem){
                max2 = rem;
            }
            n /= 10;
        }
        return max1 * max2;
    }
}