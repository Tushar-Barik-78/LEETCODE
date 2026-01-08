class Solution {
    public String reversePrefix(String s, int k) {
        if(k==1) return s;
        StringBuilder rev = new StringBuilder(s.substring(0,k));
        
        return rev.reverse().toString()+s.substring(k,s.length());
    }
}