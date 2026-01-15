class Solution {
    public String decodeMessage(String key, String message) {
HashMap<Character,Character> keyMap = new HashMap<>();
        char alpha = 'a';
        for(int i=0;i<key.length();i++){
            char ch = key.charAt(i);
            if (ch != ' ' && !keyMap.containsKey(ch)) {
                keyMap.put(ch,alpha);
                alpha += 1;
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
        for(int i=0;i<message.length();i++){
            char ch = message.charAt(i);
            if(ch == ' '){
                ans.append(ch);
            }else{
                ans.append(keyMap.get(ch));
            }
        }
        
        
        return ans.toString();    }
}