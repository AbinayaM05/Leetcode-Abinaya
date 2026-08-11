// Last updated: 8/11/2026, 10:03:56 PM
public class Solution {
public List<String> binaryTreePaths(TreeNode root) {
    List<String> sList=new LinkedList<String>();
    if (root==null) return sList;
    if (root.left==null && root.right==null) {
        sList.add(Integer.toString(root.val));
        return sList;
    }
    for (String s: binaryTreePaths(root.left)) {
        sList.add(Integer.toString(root.val)+"->"+s);
    }
    for (String s: binaryTreePaths(root.right)) {
        sList.add(Integer.toString(root.val)+"->"+s);
    }
    return sList;
}
}