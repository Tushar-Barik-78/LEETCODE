class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                st.push(ch);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }

        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }

        return ans.toString();
    }
}