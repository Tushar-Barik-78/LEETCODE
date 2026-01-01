class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag = true;
        for(int i = digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                flag = false;
                break;
            }else{
                digits[i] = 0;
            }
        }

        if(flag) {
            int[] newArr = new int[digits.length+1];
            newArr[0] = 1;
            return newArr;
        }
        return digits;
    }
}