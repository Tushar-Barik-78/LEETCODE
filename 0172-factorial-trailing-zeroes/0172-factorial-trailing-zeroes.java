class Solution {
    public int trailingZeroes(int n) {
        int five= 5;
        int count = 0;
        while(five <= n){
            count += n/five;
            five *= 5;
        }

        return count;
    }
}