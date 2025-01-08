package treeStructure;

class BinaryTree<E> {
  public E data;
  public BinaryTree<E> left;
  public BinaryTree<E> right;

  public BinaryTree() {
  }

  public BinaryTree(E data) {
    this.data = data;
  }

  public BinaryTree(E data, BinaryTree<E> left, BinaryTree<E> right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public static boolean exists(BinaryTree<Integer> root, int key) {
    BinaryTree<Integer> iterator = root;

    while (iterator != null) {
      if (iterator.data == key)
        return true;

      if (iterator.data >= key)
        iterator = iterator.left;
      else
        iterator = iterator.right;
    }
    return false;
  }
}
