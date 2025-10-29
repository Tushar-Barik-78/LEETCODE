class Solution {
    public String intToRoman(int num) {
        int[] keys = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] values = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder s = new StringBuilder();
        for(int i=0;i<keys.length;i++){
            while(num >= keys[i]){
                int quotient = num/keys[i];
                s.append(values[i].repeat(quotient));
                num = num%keys[i];
            }
        }

        return s.toString();
    }
}