class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
        
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],i);
        // }

        // int[] ans = {-1};
        for(int i=0;i<nums.length;i++){
            int partner = target - nums[i];
            if(map.containsKey(partner) ){
                return new int[]{i,map.get(partner)};
            }
            map.put(nums[i],i);

        }
        return new int[]{};
    }
}