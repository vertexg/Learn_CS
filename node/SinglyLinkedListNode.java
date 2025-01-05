package node;

class SinglyLinkedListNode<E> {
  public E data;
  public SinglyLinkedListNode<E> next;

  public SinglyLinkedListNode(E data) {
    this.data = data;
    this.next = null;
  }
}
