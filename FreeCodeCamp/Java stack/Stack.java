import java.util.EmptyStackException;

// Implementing Stack using LinkedList:
class Stack { 
    private ListNode top;
    private int length;
    
    public static class ListNode{
        private final int data;
        private ListNode next;
        
        public ListNode(int data){
            this.data = data;
        }
    }
    
    public Stack(){
        top = null;
        length = 0;
    }
    
    public void push(int data){
        // check if stack is full; we won't as it's linked list.

        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;  
        length++;      
    }
    
    public int pop(){
        if(isEmpty())
            throw new EmptyStackException();
        
        int topValue = top.data;
        top = top.next;
        length--;
        return topValue;
    }
    
    public int peek(){
        if(length == 0)
            throw new EmptyStackException();
        return top.data;
    }
    
    public void print(){
        ListNode curr = top;
        StringBuilder sb = new StringBuilder();
        
        while(curr != null){
            sb.append(curr.data).append(" -> ");
            curr = curr.next;
        }
        
        sb.append("null");
        System.out.println(sb.toString());
    }
    
    public boolean isEmpty(){
        return length == 0;
    }
    
    public int length(){
        return length;
    }

  public static void main(String[] args) {
      Stack s = new Stack();      
      System.out.println("length: " + s.length() + "    isEmpty(): "+ s.isEmpty());
      
      s.push(1);
      s.print();
      System.out.println("length: " + s.length() + "    isEmpty(): "+ s.isEmpty() + "   peak val: "+ s.peek());
      s.push(2);
      s.print();
      System.out.println("length: " + s.length() + "    isEmpty(): "+ s.isEmpty() + "   peak val: "+ s.peek());
      s.push(3);
      s.print();
      System.out.println("length: " + s.length() + "    isEmpty(): "+ s.isEmpty() + "   peak val: "+ s.peek());
      
      s.pop();
      s.print();
      System.out.println("length: " + s.length() + "    isEmpty(): "+ s.isEmpty() + "   peak val: "+ s.peek());
  }
}
