class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   // important base case
        
        int prefixSum = 0;
        int count = 0;
        
        for (int num : nums) {
            
            if (num % 2 == 1) {
                prefixSum += 1;
            }
            
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}