 import java.util.*;
class Solution {
        List<Integer> arr = new ArrayList<>(); 
    public List<Integer> postorder(Node root) {
            if(root == null)
            return arr;

            for(Node i : root.children)
            {
                postorder(i);
            }
            arr.add(root.val);
            return arr;
            
            }

}