package treeStructure;

public class kouzokuNode extends BinaryTree<Integer> {
  public static BinaryTree<Integer> successor(BinaryTree<Integer> root, int key) {

    BinaryTree<Integer> current = root;
    BinaryTree<Integer> successor = null;

    while (current != null) {
      if (key < current.data) {
        successor = current;
        current = current.left;
      } else {
        current = current.right;
      }
    }

    if (successor == null)
      return null;

    return successor;
  }

}
