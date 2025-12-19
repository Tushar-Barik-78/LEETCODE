class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && ((st.peek() == ch+32) || st.peek() == ch-32)){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }
        return ans.toString();
    }
}