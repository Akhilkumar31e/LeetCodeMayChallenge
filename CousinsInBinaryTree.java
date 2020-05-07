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
    public int d;
    public void depth(TreeNode root,int x,int dp){
        if(root==null) return;
        if(root.val==x){
            d=dp;
            return;
        }
        
        depth(root.left,x,dp+1);
        depth(root.right,x,dp+1);
        
    }
    public int parent(TreeNode root,int x){
        if(root==null) return -1;
        if(root.left!=null){
            if(root.left.val==x) return root.val;
        }
        if(root.right!=null){
            if(root.right.val==x) return root.val;
        }
        int left=parent(root.left,x);
        int right=parent(root.right,x);
        if(left!=-1) return left;
        else return right;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        d=0;
        depth(root,x,0);
        int xd=d;
        d=0;
        depth(root,y,0);
        int yd=d;
        int xp=parent(root,x);
        int yp=parent(root,y);
        System.out.println(xd+" "+yd+" "+xp+" "+yp);
       if(xd==yd){
           if(xp!=yp) return true;
           else return false;
       }
        return false;
      
    }
}