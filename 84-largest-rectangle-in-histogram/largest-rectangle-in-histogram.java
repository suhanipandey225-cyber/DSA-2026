
// class Solution {
//     public int largestRectangleArea(int[] heights) {
        
//         int n = heights.length;
//         int maxArea = 0;

//         for(int i = 0; i < n; i++) {
            
//             int left = i;
//             int right = i;

//             // move left
//             while(left >= 0 && heights[left] >= heights[i]) {
//                 left--;
//             }

//             // move right
//             while(right < n && heights[right] >= heights[i]) {
//                 right++;
//             }

//             int width = right - left - 1;
//             int area = heights[i] * width;

//             maxArea = Math.max(maxArea, area);
//         }

//         return maxArea;
//     }
// }




class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] nsl = new int[n];
        int[] nsr = new int[n];

        Stack<Integer> st = new Stack<>();

        // NSL
        for(int i = 0; i < n; i++){

            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        // NSR
        for(int i = n-1; i >= 0; i--){

            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nsr[i] = n;
            }
            else{
                nsr[i] = st.peek();
            }

            st.push(i);
        }

        int maxArea = 0;

        for(int i = 0; i < n; i++){
            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i] * width;

            maxArea = Math.max(maxArea , area);
        }

        return maxArea;
    }
}