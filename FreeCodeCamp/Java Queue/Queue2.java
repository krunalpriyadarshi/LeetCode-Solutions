public class Queue2 { 
  private ListNode front;
    private ListNode end;
    private int length;
    
    class ListNode{
        private final int data;
        private ListNode next;
        
        public ListNode (int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public Queue2(){
        this.front = null;
        this.end = null;
        this.length= 0;
    }
    
    public boolean isEmpty(){
         return length == 0;
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }   
        ListNode curr = front;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
         System.out.println("Null");
    }
    
    public int length(){
        return length;
    }
    
    class EmptyQueueException extends Exception{
        public EmptyQueueException(String msg){
            super(msg);
        } 
    }
    
    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        
        if(isEmpty())
            front = temp;
        else
            end.next = temp;
        
        end = temp;
        length++;
    }
    
    public int dequeue() throws EmptyQueueException{
        if(isEmpty())
            throw new EmptyQueueException("Queue is empty. Can not remove element from queue.");
        
        int deletedItem = front.data;
        front = front.next;
        if(front == null)
            end = null;
        length--;
        
        return deletedItem;
    }  
    
    public int first() throws EmptyQueueException{
        if(isEmpty())
            throw new EmptyQueueException("Queue is empty.");
        return front.data;
    }
    
    public int last() throws EmptyQueueException{
        if(isEmpty())
            throw new EmptyQueueException("Queue is empty.");
        return end.data;
    }
    
  public static void main(String[] args) {
      Queue2 q= new Queue2();
      q.enqueue(10);
      q.print();
      q.enqueue(20);
      q.print();
      q.enqueue(30);
      q.print();
      
      
      try{
          System.out.println("First: " + q.first() + " Last: " + q.last());
      
          System.out.println(q.dequeue());
          q.print();
          System.out.println(q.dequeue());
          q.print();
          System.out.println(q.dequeue());
          q.print();
          System.out.println(q.dequeue());
          q.print();          
      }
      catch(EmptyQueueException e){
          System.out.println(e.getMessage());
      }
      
  }
}
