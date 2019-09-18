Space complexity: O(n)
Time complexity: O(n)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lo = new ArrayList<>();
        func(root,0,lo);
        return lo;
    }
    private void func(TreeNode node, int level, List<List<Integer>> lo){
        if(node==null) return;
        int size = lo.size();
        if(size==level){
            List<Integer> li = new ArrayList<>();
            li.add(node.val);
            lo.add(li);
        }
        else {
            for(int i=0;i<lo.size();i++){
               if(level==i){
                    lo.get(i).add(node.val);
                    break;
                }
            }    
        }
        func(node.left,level+1,lo);
        func(node.right,level+1,lo);
        return;
    }
}
