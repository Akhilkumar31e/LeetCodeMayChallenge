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
    int index = 0;
    TreeNode pre(int[] preorder, int min, int max){
        if(index >= preorder.length)
            return null;
        int key = preorder[index];
        TreeNode temp = null;
        if(key > min && key < max){
            temp = new TreeNode(preorder[index]);
            index++;
            temp.left = pre(preorder, min, key);
            temp.right = pre(preorder, key, max);
        }
        return temp;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0)
            return null;
        return pre(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
}