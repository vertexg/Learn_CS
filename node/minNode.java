package node;

import java.util.ArrayList;

public class minNode extends BinaryTree<Integer> {

  public static BinaryTree<Integer> minimumNode(BinaryTree<Integer> root) {
    BinaryTree<Integer> iterator = root;
    BinaryTree<Integer> minNode = root;

    if (root == null)
      return null;

    while (iterator.left != null) {

      iterator = iterator.left;
    }

    return iterator;

  }
}
