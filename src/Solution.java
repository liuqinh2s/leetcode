import java.util.ArrayList;
import java.util.List;

class Solution {
    private int result=0;
    private Map<TreeNode, Integer> map = new HashMap<>();
    public int distributeCoins(TreeNode root) {
        if(root==null){
            return result;
        }
        result = Math.abs(need(root.left))+Math.abs(need(root.right));
        distributeCoins(root.left);
        distributeCoins(root.right);
        return result;
    }

    private int need(TreeNode node){
        if(node==null){
            return 0;
        }
        if(map.get(node)!=null){
            return map.get(node);
        }
        int needs = 1-node.val+need(node.left)+need(node.right);
        map.put(node, needs);
        return needs;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        Solution solution = new Solution();
        System.out.println(solution.uniquePathsIII(grid));
    }
}