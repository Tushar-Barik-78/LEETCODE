class Solution {

    public static int gcd(int a, int b){
        while(a >0 && b>0){
            if(a>b) a %= b;
            else b %= a;
        }

        return (a == 0) ? b : a;
    }

    public int findGCD(int[] nums) {
        int small = nums[0];
        int large = nums[0];
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(small < nums[i]){
                small = nums[i];
            }
            if(large > nums[i]){
                large = nums[i];
            }
        }

        return gcd(small, large);
    }
}