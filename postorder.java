import java.util.*;
class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
            postorderTraversal(root.left);
           
            postorderTraversal(root.right);
             arr.add(root.val);
        }
        return arr;
    }
}