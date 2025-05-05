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
  public List<Integer> rightSideView(TreeNode root) {
      List<Integer> result = new ArrayList<>();
      if(root == null)
          return result;

      List<TreeNode> level = new ArrayList<>();
      level.add(root);

      do{
          // add last element to result:
          result.add(level.get(level.size()- 1).val);

          // add childs to temp:
          List<TreeNode> temp = new ArrayList<>();
          for(TreeNode node : level){
              if(node.left != null)
                  temp.add(node.left);
              if(node.right != null)
                  temp.add(node.right);
          }

          level = temp;
      }
      while(!level.isEmpty());

      return result;
  }
}