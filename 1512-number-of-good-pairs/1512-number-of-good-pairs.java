class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;

        for(int i=0;i<n;i++){
            int curr = nums[i];
            count += map.getOrDefault(curr,0);

            map.put(curr,map.getOrDefault(curr,0)+1);
        }

        return count;
    }
}