class Solution {
    public double pow (double x, int n){
         if(n == 0) return 1;

        double sq = pow(x,n/2);

        if(n%2 == 0){
            return sq*sq;
        }

        return sq*sq*x;
    }
    public double myPow(double x, int n) {
        double ans = pow(x, n);
       if (n >= 0) return ans;

       return 1/ans;
    }
}