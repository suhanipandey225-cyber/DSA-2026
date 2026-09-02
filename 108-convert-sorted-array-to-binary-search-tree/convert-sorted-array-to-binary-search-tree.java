/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);
    }

    private TreeNode createBST(int[] nums, int left, int right) {

        // Base case
        if (left > right) {
            return null;
        }

        // Find middle
        int mid = left + (right - left) / 2;

        // Create root
        TreeNode root = new TreeNode(nums[mid]);

        // Create left subtree
        root.left = createBST(nums, left, mid - 1);

        // Create right subtree
        root.right = createBST(nums, mid + 1, right);

        return root;
    }
}