class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0;
        long con = 0;
        long sum = 0;
        long pow = 1;

        while(n >0){
            int rem = n%10;
            if(rem != 0){
                con += pow*rem ;
                sum += rem;
                pow *= 10;
            }

            n /= 10;
        }


        return con*sum;
    }
}