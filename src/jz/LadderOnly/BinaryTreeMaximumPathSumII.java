package jz.LadderOnly;

import jz.tree.bst.TreeNode;

//http://lintcode.com/en/problem/binary-tree-maximum-path-sum-ii/
public class BinaryTreeMaximumPathSumII {

    public int maxPathSum2(TreeNode root) {
    	if(root == null) {
    		return Integer.MIN_VALUE;
    	}
    	
    	int left = maxPathSum2(root.left);
    	int right = maxPathSum2(root.right);
    	
    	return root.val + Math.max(0, Math.max(left, right));
    	
    }

}
