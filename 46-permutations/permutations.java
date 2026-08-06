class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums,0);
        return ans;
     }
    private void backtrack(int[] nums,int index){
        if(index== nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int x: nums)
                temp.add(x);
                ans.add(temp);
                return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            backtrack(nums,index+1);
            swap(nums,i,index);
        }
    }  
    void swap(int[] nums , int i, int j){
        int t= nums[i];
        nums[i]= nums[j];
        nums[j]= t;
    }  
}