class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        // String ans = "";

        // for(String s:words){
        //     int sum = 0;
        //     for(int i=0;i<s.length();i++){
        //         sum += weights[s.charAt(i)-'a'];
        //     }
        //     ans += (char)('a' + (25 - sum % 26 ));
        // }


        // return ans;

          StringBuilder ans = new StringBuilder();
        for(String s : words){
            int sum = 0;
            for(int i=0; i<s.length(); i++){
                sum += weights[s.charAt(i) - 'a'];
            }
            int c = 25 - (sum % 26);
            ans.append((char) ('a' + c));
        }
        return ans.toString();

    }
}