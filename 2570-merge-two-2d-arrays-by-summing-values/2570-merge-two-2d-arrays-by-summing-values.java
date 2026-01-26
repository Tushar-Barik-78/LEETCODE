class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        ArrayList<int[]> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i<n1 && j<n2){
            if(nums1[i][0] == nums2[j][0]){
                ans.add(new int[]{nums1[i][0], nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }else if(nums1[i][0] < nums2[j][0]){
//                ans[k][0] = nums1[i][0];
//                ans[k][1] = nums1[i][1];
                ans.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }else{
                ans.add(new int[]{nums2[j][0],nums2[j][1]});
//                ans[k][0] = nums2[j][0];
//                ans[k][1] = nums2[j][1];
                j++;
            }
        }

        if( i == n1){
            while( j<n2){
//                ans[k][0] = nums2[j][0];
//                ans[k][1] = nums2[j][1];
                ans.add(new int[]{nums2[j][0],nums2[j][1]});

                j++;
            }
        }else{
            while (i<n1){
//                ans[k][0] = nums1[i][0];
//                ans[k][1] = nums1[i][1];
                ans.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }
        }


        return ans.toArray(new int[ans.size()][]);
    }
}