class Solution {
    public static boolean isVowel(char ch ){
return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U';    }
    public String reverseVowels(String s) {
        
        char[] ch = s.toCharArray();
        int n = ch.length;
        int i=0;
        int j = n-1;
        while(i<j){
            while(i<j && !isVowel(ch[i])){
                i++;
            }while(i<j && !isVowel(ch[j])){
                j--;
            }

            char t = ch[i];
            ch[i] = ch[j];
            ch[j] = t;

            i++;
            j--;
            
        }
        
        return String.valueOf(ch);
    }
}