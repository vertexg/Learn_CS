package node;

public class SearchingLinkedList {
  public static int linkedListSearch(SinglyLinkedListNode<Integer> head, int data) {
    SinglyLinkedListNode<Integer> current = head;
    int index = -1;
    while (current != null) {
      index++;
      if (current.data == data) {
        return index;
      }
      current = current.next;
    }
    return -1;
  }
}
