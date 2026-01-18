
class Solution { 
  private static ListNode head;

  private static class ListNode{
    private final int data;
    private ListNode next;

    public ListNode(int val){
      this.data = val;
      this.next = null;
    }
  }
  
  public void display(){
    ListNode curr = head;

    while(curr != null){
      System.out.print(curr.data + "-->");
      curr = curr.next;
    }

    System.out.println("null");
  }

  public int length(){
    if(head == null)
      return 0;

    int count = 0;
    ListNode curr = head;

    while(curr !=  null){
      curr = curr.next;
      count++;
    }

    return count;
  }

  public void insertFirst(int val){
    ListNode temp = new ListNode(val);
    temp.next = head;
    head = temp;
  }

  public void insertLast(int val){
    ListNode curr = head;

    if(curr == null){
      head = new ListNode(val);
      return;
    }

    while(curr.next != null){
      curr = curr.next;
    }

    curr.next = new ListNode(val);
  }

  public void insert(int val, int index) throws CustomException.InvalidLengthException {
    if (index < 0) {
        throw new CustomException.InvalidLengthException("Invalid Index: Index cannot be negative.");
    }

    if (index == 0) {
        insertFirst(val);
        return;
    }

    // If the list is empty and index > 0
    if (head == null) {
        throw new CustomException.InvalidLengthException(
                "Invalid Index: Cannot insert at index " + index + " in an empty list."
        );
    }

    // Create the new node
    ListNode newNode = new ListNode(val);

    // Pointer to traverse and find the correct position
    ListNode current = head;
    int currentIndex = 0;

    while (currentIndex < index - 1) {
        current = current.next;

        // If the index is out of bounds
        if (current == null) {
            throw new CustomException.InvalidLengthException(
                    "Invalid Index: The specified index " + index + 
                    " exceeds the list length " + length() + "."
            );
        }

        currentIndex++;
    }

    // Insert the new node
    newNode.next = current.next;
    current.next = newNode;

    // Display the updated list
    display();
}

  public ListNode deleteFirst() throws CustomException.LinkedListLengthOutOfBoundException{
    if(head == null){
        throw new CustomException.LinkedListLengthOutOfBoundException("LinkedList is empty.");
        //return null;
    }    
    
    ListNode temp = head;
    head = head.next;
    temp.next = null;

    return temp;
  }

  public ListNode deleteLast(){
    
  }

  public static void main(String[] args) {
      Solution sll = new Solution();

      head = new ListNode(10);
      ListNode second = new ListNode(20);
      ListNode third = new ListNode(30);
      ListNode forth = new ListNode(40);

      head.next = second;
      second.next = third;
      third.next = forth;

      sll.display();
      System.out.println("Length of LL: " + sll.length());

      try {
          sll.deleteFirst();
          sll.display();

          
          sll.deleteFirst();
          sll.display();

          
          sll.deleteFirst();
          sll.display();

          
          sll.deleteFirst();
          sll.display();

          
          sll.deleteFirst();
          sll.display();

          
      } catch (CustomException.LinkedListLengthOutOfBoundException e) {
        System.out.println(e.getMessage());
      }
      
  }
}
