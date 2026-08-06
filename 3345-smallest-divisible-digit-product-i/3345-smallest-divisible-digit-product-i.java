class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(digitMul(n)%t == 0) return n;
            n++;
        }
    }
    public static int digitMul(int n){
        int sum=1;
        while(n>0){
            sum*=(n%10);
            n/=10;
        }
        return sum;
    }
}