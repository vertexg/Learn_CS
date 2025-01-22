package node;

class insertNode {
  public static SinglyLinkedListNode<Integer> insertNodeInSorted(SinglyLinkedListNode<Integer> head, int data) {
    // ダミーのノードを作ります。dataは仮にintの最小値MIN_VALUEを入れておきます。
    SinglyLinkedListNode<Integer> dummyNode = new SinglyLinkedListNode<Integer>(Integer.MIN_VALUE);
    // ダミーノードをhead の前に挿入します。
    dummyNode.next = head;

    SinglyLinkedListNode<Integer> iterator = dummyNode;

    // 挿入すべき位置までリストを走査します。
    while (iterator.next != null && iterator.next.data < data) {
      iterator = iterator.next;
    }

    // 新しいノードを作ります。
    SinglyLinkedListNode<Integer> node = new SinglyLinkedListNode<Integer>(data);
    // iterator.nextをtempに入れ保管します。
    SinglyLinkedListNode<Integer> temp = iterator.next;
    // iterator.nextには新しいノードを入れます。
    iterator.next = node;
    // tempに入れていた参照を新しいノードのnextにします。
    node.next = temp;

    // ダミーの次のノードから返します。
    return dummyNode.next;
  }
}
