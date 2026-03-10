// class Solution {
//     public boolean threeConsecutiveOdds(int[] arr) {
//         int number=0;
//     for(int i=0;i<arr.length;i++){
//         if(i%2==0){
//             number++;

//         }
//         else{
//            return true;
//         }
//     }
//         return false;
//     }
// }




class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int number = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){   // check element, not index
                number++;

                if(number == 3){   // 3 consecutive odds
                    return true;
                }
            }
            else{
                number = 0;        // reset if even number appears
            }
        }
        return false;
    }
}