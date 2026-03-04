class Solution {
   public void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n-1;
        for(; i>0;i--){
            if(arr[i-1] < arr[i]){
                break;
            }
        }

        // If array have the largest number
        if(i == 0){
            reverse(arr, i, n-1);
            return;
        }

        // Now swap arr[i-1]  with just greater no to that at right
        int r_index = findJustGreater(arr,arr[i-1],i,n);

        // now swap arr[i-1] with arr[r]
        int temp = arr[i-1];
        arr[i-1] = arr[r_index];
        arr[r_index] = temp;

        // Now make the right side array small
        reverse(arr,i,n-1);
    } 
    public static void reverse (int [] arr,int l , int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }
    public static int findJustGreater(int[] arr , int target, int i,int n){
        int r_index = i;
        int min_abs = Integer.MAX_VALUE;
        while(i < n){
            if(arr[i] > target){
                int abs = Math.abs(target - arr[i]);
                if(abs <= min_abs){
                    r_index = i;
                    min_abs = abs;
                }
            }
            i++;
        }

        return r_index;
    }
}