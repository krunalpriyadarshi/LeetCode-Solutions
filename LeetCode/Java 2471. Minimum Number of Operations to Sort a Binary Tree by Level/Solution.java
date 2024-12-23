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

// https://leetcode.cn/problems/minimum-number-of-operations-to-sort-a-binary-tree-by-level/solutions/1965422/by-endlesscheng-97i9/
class Solution {//离散化+原地交换法。即灵神说的“置换环”
  public int minimumOperations(TreeNode root) {
      Queue<TreeNode> queue = new ArrayDeque<>();
      int ans = 0;
      queue.offer(root);
      while (!queue.isEmpty()) {
          int size = queue.size();
          int[] arr = new int[size], temp = new int[size];
          for (int i = 0; i < size; i++) {
              TreeNode cur = queue.poll();
              arr[i] = temp[i] = cur.val;
              if (cur.left != null) queue.offer(cur.left);
              if (cur.right != null) queue.offer(cur.right);
          }
          Map<Integer, Integer> map = new HashMap<>();
          Arrays.sort(temp);
          for (int i = 0; i < arr.length; i++) map.put(temp[i], i);
          for (int i = 0; i < arr.length; i++) {
              while (arr[i] != temp[i]) {
                  int j = map.get(arr[i]);
                  int t = arr[i];
                  arr[i] = arr[j];
                  arr[j] = t;
                  ans++;
              }
          }
      }
      return ans;
  }
}