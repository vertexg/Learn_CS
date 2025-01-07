package node;

import java.util.ArrayList;

public class koujunn extends BinaryTree<Integer> {
  public static int[] postorderTraversal(BinaryTree<Integer> root) {
    // 関数を完成させてください
    ArrayList<Integer> arr = new ArrayList<>();

    arr = postorderTraversalHelper(root, arr);

    int[] ans = new int[arr.size()];

    for (int i = 0; i < ans.length; i++) {
      ans[i] = arr.get(i);
    }
    return ans;

  }

  public static ArrayList<Integer> postorderTraversalHelper(BinaryTree<Integer> postRoot, ArrayList<Integer> arr) {
    if (postRoot == null)
      return null;
    postorderTraversalHelper(postRoot.left, arr);
    postorderTraversalHelper(postRoot.right, arr);
    arr.add(postRoot.data);

    return arr;
  }

}
