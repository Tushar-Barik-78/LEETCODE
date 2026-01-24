class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int[] map = new int[10];

        
        int sm1 = Integer.MAX_VALUE;
        for(int i: nums1){
            map[i]++;
            sm1  = Math.min(sm1, i);
        }
        int sm2 = Integer.MAX_VALUE;
        for(int i: nums2){
            sm2  = Math.min(sm2, i);
            map[i]++;
        }

        for(int i=0;i<10;i++){
            if(map[i] == 2){
                return i;
            }
        }

        int ans = Math.min(sm1, sm2)*10 + Math.max(sm1,sm2);


return ans;
    }
}