class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // [-4,-1,-1,0,1,2]
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = n - 1;
            int target = -nums[i];
            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);

                    ans.add(list);

                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }

                    l++;
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return ans;
    }
}