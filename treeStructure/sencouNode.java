package treeStructure;

class sencouNode extends BinaryTree<Integer> {
  public static BinaryTree<Integer> predecessor(BinaryTree<Integer> root, int key) {
    BinaryTree<Integer> targetNode = findNode(root, key);
    if (targetNode == null)
      return null;
    if (targetNode.left != null)
      return findMaxNode(targetNode.left);

    BinaryTree<Integer> iterator = root;
    BinaryTree<Integer> predecessor = null;
    while (iterator != null) {
      if (iterator.data < key) {
        predecessor = iterator;
      }
      if (iterator.data < key)
        iterator = iterator.right;
      else
        iterator = iterator.left;
    }
    return predecessor;

  }

  public static BinaryTree<Integer> findNode(BinaryTree<Integer> root, int key) {
    BinaryTree<Integer> iterator = root;
    while (iterator.left != null) {
      if (iterator.data == key)
        return iterator;

      if (iterator.data < key)
        iterator = iterator.right;
      else
        iterator = iterator.left;
    }
    return iterator;
  }

  public static BinaryTree<Integer> findMaxNode(BinaryTree<Integer> root) {
    BinaryTree<Integer> iterator = root;
    while (iterator != null && iterator.right != null) {
      iterator = iterator.right;
    }
    return iterator;
  }
}
