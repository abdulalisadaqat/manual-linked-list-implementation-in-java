public class LinkedList {
  Node first;

  // inert methods
  public void insertAtFirst(int data) {
    Node newNode = new Node(data);
    newNode.next = first;
    first = newNode;
  }

  public void insertAtLast(int data) {
    Node newNode = new Node(data);
    Node temp = first;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }

  public void insertAfterKey(int key, int data) {
    Node newNode = new Node(data);
    Node temp = first;
    while (temp != null && temp.data != key) {
      temp = temp.next;
    }
    if (temp == null) {
      System.out.printf("Key (%d) does not exist in the list!\n", key);
      return;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  // delete methods
  public void deleteFromFirst() {
    if (first == null) {
      System.out.println("List is empty!");
      return;
    }
    Node temp = first;
    first = first.next;
    System.out.printf("key (%d) was deleted form the list!\n", temp.data);
  }

  public void deleteFromLast() {
    if (first == null) {
      System.out.println("List is empty!");
      return;
    }
    Node currentNode = first;
    Node prevNode = first;
    while (currentNode.next != null) {
      prevNode = currentNode;
      currentNode = currentNode.next;
    }
    prevNode.next = null;
    System.out.printf("key (%d) was deleted form the list!\n", currentNode.data);
  }

  public void deleteByKey(int key) {
    if (first == null) {
      System.out.println("List is empty!");
      return;
    }
    Node currentNode = first;
    Node prevNode = first;
    while (currentNode.data != key) {
      prevNode = currentNode;
      currentNode = currentNode.next;
    }
    prevNode.next = currentNode.next;
    System.out.printf("key (%d) was deleted form the list!\n", currentNode.data);
  }

  // print the list
  public void displayList() {
    if (first == null) {
      System.out.println("List is empty!");
      return;
    }
    Node temp = first;
    while (temp != null) {
      System.out.printf("%d, ", temp.data);
      temp = temp.next;
    }
  }
}