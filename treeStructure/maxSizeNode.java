package treeStructure;

public class maxSizeNode extends BinaryTree {
  public static BinaryTree<Integer> maximumNode(BinaryTree<Integer> root) {
    BinaryTree<Integer> iterator = root;
    while (iterator.right != null) {
      iterator = iterator.right;
    }
    return iterator;
    // 関数を完成させてください
  }
}
