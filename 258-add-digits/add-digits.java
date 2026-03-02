class Solution {
    public int addDigits(int num) {
        while (num >= 10) {  // while more than 1 digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}