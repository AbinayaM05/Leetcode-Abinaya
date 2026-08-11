// Last updated: 8/11/2026, 10:06:16 PM
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        post(root, ans);
        return ans;
    }

    void post(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;

        post(root.left, ans);
        post(root.right, ans);
        ans.add(root.val);
    }
}