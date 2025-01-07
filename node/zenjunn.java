package node;

import java.util.ArrayList;

public class zenjunn extends BinaryTree {
  public static int[] preorderTraversal(BinaryTree<Integer> root) {
    ArrayList<Integer> res = new ArrayList<>();
    res = preorderTraversalHelper(root, res);
    int[] result = new int[res.size()];
    for (int i = 0; i < res.size(); i++) {
      result[i] = res.get(i);
    }
    return result;

  }

  public static ArrayList<Integer> preorderTraversalHelper(BinaryTree<Integer> preRoot, ArrayList<Integer> arr) {
    if (preRoot != null) {
      arr.add(preRoot.data);
      preorderTraversalHelper(preRoot.left, arr);
      preorderTraversalHelper(preRoot.right, arr);
    }
    return arr;
  }

}
