class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i: nums){
            set.add(i);
        }

        int sum = nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]+1) break;
            sum += nums[i];
        }

        while(set.contains(sum)){
            sum++;
        }


        return sum;


    }
}