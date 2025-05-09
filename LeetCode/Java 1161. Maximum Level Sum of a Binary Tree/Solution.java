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
    public int maxLevelSum(TreeNode root) {
        int ans = 0;
        List<TreeNode> bfs = new ArrayList<>();
        bfs.add(root);

        int max = Integer.MIN_VALUE;
        int level = 0;
        while(!bfs.isEmpty()){
            level++;
        
            List<TreeNode> temp = new ArrayList<>();
            int sum = 0;
            for(TreeNode node : bfs){
                // Sum:
                sum += node.val;

                // Left node
                if(node.left != null){
                    temp.add(node.left);
                }
                // Right node
                if(node.right != null){
                    temp.add(node.right);
                }
            }

            if(sum > max){
                max = sum;
                ans = level; 
            }
            bfs = temp;
        }

        return ans;
    }
}