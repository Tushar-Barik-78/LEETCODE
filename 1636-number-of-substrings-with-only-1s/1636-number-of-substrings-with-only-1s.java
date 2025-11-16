class Solution {
   static int mod = 1000000007;
    public static int findSubStrings(int count){
        return ((count*(count+1))/2)%mod;
    }
    public int numSub(String s) {
        long count = 0;
        long ans = 0;
    
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '1'){
                count++;
            }
            else{
                ans += (count*(count+1))/2;
                count = 0;
            }
        }

        if(count != 0){
            ans += (count*(count+1))/2;
        }


        return (int)(ans%mod);
    }
}