// Last updated: 8/11/2026, 10:00:45 PM
class Solution {
    private int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        computeDiameter(root);
        return max;
    }

    private int computeDiameter(TreeNode node){
        if(node==null) return 0;

        int left = computeDiameter(node.left);
        int right = computeDiameter(node.right);

        max = Math.max(max,left+right);

        return 1 + Math.max(left, right);
    }
}
