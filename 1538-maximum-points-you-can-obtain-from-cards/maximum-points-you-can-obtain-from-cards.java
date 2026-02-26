class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n = cardPoints.length;
        int totalSum = 0;
        
        for (int num : cardPoints) {
            totalSum += num;
        }
        
        if (k == n) return totalSum;
        
        int windowSize = n - k;
        int currSum = 0;
        
        for (int i = 0; i < windowSize; i++) {
            currSum += cardPoints[i];
        }
        
        int minSum = currSum;
        
        for (int i = windowSize; i < n; i++) {
            currSum += cardPoints[i];
            currSum -= cardPoints[i - windowSize];
            minSum = Math.min(minSum, currSum);
        }
        
        return totalSum - minSum;
    }
}