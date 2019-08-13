import java.util.List;

/**
 * @author wjj
 */
public class Client {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t20 = new TreeNode(2);
        TreeNode t21 = new TreeNode(2);
        t1.right=t20;
        t20.left=t21;
        int[] mode = new Solution().findMode(t1);
    }

}
