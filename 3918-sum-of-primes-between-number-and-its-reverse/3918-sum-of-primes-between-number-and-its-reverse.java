class Solution {
    public static int reverse(int n){
        int rev = 0;
        while(n > 0){
            rev = rev*10 + (n%10);
            n/=10;
        }

        return rev;
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        int sq =(int)Math.sqrt(n);

        for(int i=2;i<=sq;i++){
            if(n%i == 0) return false;
        }

        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int r = reverse(n);
        int min = Math.min(n,r);
        int max = Math.max(n,r);

        int sum = 0;
        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                sum += i;
            }
        }

        return sum;
    }
}