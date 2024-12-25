import java.util.ArrayList;
import java.util.List;

/*
 * Use DFS to traverse the tree and keep track of level in helper function.
 */

class Solution {
  List<Integer> result = new ArrayList<Integer>();

  public List<Integer> largestValues(TreeNode root) {
      largestValuesHelper(root , 0);

      return result;
  }

  public void largestValuesHelper(TreeNode node, int level){
      if(node == null)
          return;

      if(result.size() <= level)
          result.add(node.val);
      else{
          int val = Math.max(result.get(level), node.val);
          result.set(level, val);
      }

      largestValuesHelper(node.left, level+ 1);
      largestValuesHelper(node.right, level+ 1);
  }
}