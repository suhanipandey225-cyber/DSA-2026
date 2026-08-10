class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        Arrays.sort(nums);

        generate(nums, 0, current, result);

        return result;
    }

    private void generate(int[] nums, int index, List<Integer> current,List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            // Skip duplicate elements at the same level
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            // Choose
            current.add(nums[i]);

            // Explore
            generate(nums, i + 1, current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}