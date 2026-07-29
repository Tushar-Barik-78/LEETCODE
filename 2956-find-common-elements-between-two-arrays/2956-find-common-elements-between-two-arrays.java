class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];

        HashMap<Integer,Integer> m1 = new HashMap<>();
        HashMap<Integer,Integer> m2 = new HashMap<>();

        for(int i : nums1){
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        for(int i : nums2){
            m2.put(i,m2.getOrDefault(i,0)+1);
        }

        for(int i : m1.keySet() ){
            if(m2.get(i) != null){
                ans[0] += m1.get(i);
            }
        }
        for(int i : m2.keySet() ){
            if(m1.get(i) != null){
                ans[1] += m2.get(i);
            }
        }
        
        return ans;
    }
}