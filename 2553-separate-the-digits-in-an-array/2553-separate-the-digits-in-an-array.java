class Solution {
  
    public int[] separateDigits(int[] nums) {
          ArrayList<Integer> list = new ArrayList<>();
        for(int n:nums){
            String str = String.valueOf(n);
            for(int i=0;i<str.length();i++){
                list.add(str.charAt(i)-'0');
            }
        }

        int [] ans = new int[list.size()];
        int k = 0;
        for(int n:list){
            ans[k++] = n;
        }

        return ans;
    }
}