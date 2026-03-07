class Solution {
    public boolean isPalindrome(String s) {
        // s = s.replaceAll("[^a-zA-Z0-9]","");
        // s = s.toLowerCase();
        // int l = 0;
        // int r = s.length()-1;
        // while(l<r){
        //     if(s.charAt(l)!=s.charAt(r)){
        //         return false;
        //     }
        //     l++;
        //     r--;
        // }


        // return true;

        // // StringBuilder str = new StringBuilder(s);
        // // return s.equals(str.reverse().toString());

        int l = 0;
        int r = s.length()-1;

        while(l<r){
            int lch= s.charAt(l);
            int rch= s.charAt(r);

            if(!Character.isLetterOrDigit(lch)){
                l++;
                continue;
            }
             if(!Character.isLetterOrDigit(rch)){
                r--;
                continue;
            }
            if(Character.toLowerCase(lch) != Character.toLowerCase(rch)){
                return false;
            }

            l++;
            r--;
        }


        return true;
    }
}