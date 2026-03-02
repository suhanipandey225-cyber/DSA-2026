class Solution {
    public int countDigits(int num) {
        int a = num;
        int count = 0;
        
        while (num > 0) {
            int digit = num % 10;   // last digit
            
            if (digit != 0 && a % digit == 0) {
                count++;
            }
            
            num /= 10;  // remove last digit
        }
        
        return count;
    }
}