class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first= binarySearch(nums,target,true);
        int last = binarySearch(nums,target,false);
        return new int[]{first,last};
    }
    public static int binarySearch(int[] arr,int target,boolean first){
        int ans=-1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                ans=mid;
                if(first){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return ans;
    }
}