class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] map = new int[26];

        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            map[ch-'a']++;
        }

        for(int i:map){
            if(i == 0) return false;
        }

        return true;

    }
}