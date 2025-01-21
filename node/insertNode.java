package node;

class insertNode {
  public static SinglyLinkedListNode<Integer> insertNodeInSorted(SinglyLinkedListNode<Integer> head, int data) {
    // 関数を完成させてください
    SinglyLinkedListNode<Integer> node = new SinglyLinkedListNode<Integer>(data);
    SinglyLinkedListNode<Integer> iterator = head;
    if (node.data < iterator.data) {
      node.next = iterator;
      return node;
    }
    while (iterator.next != null) {
      if (node.data < iterator.next.data) {
        SinglyLinkedListNode<Integer> tmp = iterator.next;
        iterator.next = node;
        node.next = tmp;
        return head;
      }
      iterator = iterator.next;
    }
    iterator.next = node;
    return head;
  }
}
