package node;

import java.util.ArrayList;
import java.util.Stack;

///わからなかったのでまるごとコピー

public class kanjunn extends BinaryTree {
  public static int[] inorderTraversal(BinaryTree<Integer> root) {
    Stack<BinaryTree<Integer>> stack = new Stack<>();
    BinaryTree<Integer> iterator = root;
    ArrayList<Integer> resDynamic = new ArrayList<>();

    while (!stack.isEmpty() || iterator != null) {
      while (iterator != null) {
        stack.push(iterator);
        iterator = iterator.left;
      }

      iterator = stack.pop();
      resDynamic.add(iterator.data);
      iterator = iterator.right;
    }

    int[] res = new int[resDynamic.size()];
    for (int i = 0; i < resDynamic.size(); i++) {
      res[i] = resDynamic.get(i);
    }

    return res;

  }
  // // 再帰
  // public static ArrayList<Integer> inorderTraversalHelper(BinaryTree<Integer>
  // root, ArrayList<Integer> arrDynamic){
  // if (root != null){
  // inorderTraversalHelper(root.left, arrDynamic);
  // arrDynamic.add(root.data);
  // inorderTraversalHelper(root.right, arrDynamic);
  // }

  // return arrDynamic;
  // }

  // public static int[] inorderTraversal(BinaryTree<Integer> root){
  // // 関数を完成させてください
  // ArrayList<Integer> resDynamic = new ArrayList<>();

  // resDynamic = inorderTraversalHelper(root, resDynamic);

  // int[] res = new int[resDynamic.size()];
  // for (int i = 0; i <resDynamic.size(); i++){
  // res[i] = resDynamic.get(i);
  // }

  // return res;
  // }

}
