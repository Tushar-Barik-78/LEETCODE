class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        
        int[] ans = new int[n];
        int i= 0;
        int po = 0;
        int ne = 0;
        
        while(po<n && ne<n){
            while(po<n && nums[po]<0){
                po++;
            }
            while(ne<n && nums[ne]>0){
                ne++;
            }
            
            if(i%2 == 0){
                ans[i++] = nums[po];
                po++;
            }else{
                ans[i++] = nums[ne];
                ne++;
            }
            
            
        }
        if(ne < n){
            ans[i++] = nums[ne];
                ne++;
        }
        if(po < n){
ans[i++] = nums[po];
                po++;
        }
        return ans;
    }
}