class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> map = new HashSet<>();

        int count = 0;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!map.contains(ch) && (map.contains((char)(ch - 32)) || map.contains((char)(ch + 32)))){
                count++;
            }
            map.add(ch);
        }

        return count;
    }
}