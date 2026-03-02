class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        
        // Check triangle validity
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }
        
        // All sides equal
        if (a == b && b == c) {
            return "equilateral";
        }
        
        // Any two equal
        if (a == b || b == c || a == c) {
            return "isosceles";
        }
        
        // All different
        return "scalene";
    }
}