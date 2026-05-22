class Solution {
    public int search(int[] nums, int target) {
        return searchInRotatedArray(nums,target);
    }
    static  int searchInRotatedArray(int [] arr,int target){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
//            When the right side is sorted
            else if(arr[mid]<arr[end]) {
                if (arr[mid] < target && target<=arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
//            when the left side is sorted
            else{
                if(arr[start]<=target && target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }

        return ans;


    //    int s = 0;
    //     int e = arr.length-1;

    //     while(s<=e){
    //         int mid = s+(e-s)/2;

    //         if(arr[mid] == target){
    //             return mid;
    //         }
    //         else if(arr[mid] < arr[e]){
    //             if(arr[e]>=target && arr[mid]<target){
    //                 e = mid-1;
    //             }else{
    //                 s = mid+1;
    //             }
    //         }else{
    //             if(arr[e]>target){
    //                 s = mid+1;
    //             }else{
    //                 e = mid-1;
    //             }
    //         }
    //     }

    //     return -1;
    }
}