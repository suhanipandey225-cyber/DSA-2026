class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String word : words) {
            
            int left = 0;
            int right = word.length() - 1;
            boolean isPal = true;

            while(left < right) {
                if(word.charAt(left) != word.charAt(right)) {
                    isPal = false;
                    break;
                }
                left++;
                right--;
            }

            if(isPal) {
                return word;
            }
        }

        return "";
    }
}

