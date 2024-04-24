class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public int sumNumbers(TreeNode root) {
      return dfs(root, 0);
  }
  
  public int dfs(TreeNode node, int sum){
      if(node== null) return 0;
      sum= (sum* 10) +node.val;
      if(node.left== null && node.right== null)
          return sum;
      
      int leftSum= dfs(node.left, sum);
      int rightSum= dfs(node.right, sum);

      return leftSum+ rightSum;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    Solution s = new Solution();
    System.out.println(s.sumNumbers(root));
  }
}