public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public int sumOfLeftLeaves(TreeNode root) {
    return dfs(root, false);
  }

  public int dfs(TreeNode node, boolean isLeft) {
    if (node == null)
      return 0;
    if (node.left == null && node.right == null)
      return isLeft ? node.val : 0;
    int leftSum = dfs(node.left, true);
    int rightSum = dfs(node.right, false);
    return leftSum + rightSum;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    Solution s = new Solution();
    System.out.println(s.sumOfLeftLeaves(root));
  }
}