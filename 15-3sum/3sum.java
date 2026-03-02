// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> set = new HashSet<>();
//         int i=0 ;
//         int j=0;
//         int k=0;
//        int n=nums.length;
//         for(i=0;i<n;i++){
//             for(j=i+1;j<n;j++){
//                 for(k=j+1;k<n;k++){
//                     if (nums[i]+nums[j]+nums[k]==0){
//                       List<Integer> triplet =
//                                 Arrays.asList(nums[i], nums[j], nums[k]);

//                         Collections.sort(triplet); // avoid duplicates
//                         set.add(triplet);

//                     }
                    
//                 }
//             }
//         }

//         return  new ArrayList<>(set);
//     }
// }







class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

           
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                }

                else if (sum < 0) {
                    left++;   // need bigger sum
                }

                else {
                    right--;  // need smaller sum
                }
            }
        }
        return ans;
    }
}