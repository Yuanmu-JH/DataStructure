package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TreeNode {
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

class TreePostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        TreeNode p = root,r = null;
        List<Integer>ans = new ArrayList();
        Deque<TreeNode> s = new ArrayDeque();
        while(!s.isEmpty() || p != null)
        {
            if(p != null)
            {
                s.push(p);
                p = p.left;
            }
            else
            {
                p = s.peek();
                if(p.right == null || p.right == r)
                {
                    ans.add(p.val);
                    r = p;
                    s.pop();
                    p = null;
                }
                else
                    p = p.right;

            }

        }

        return ans;
    }



}