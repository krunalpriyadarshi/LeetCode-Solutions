public class StackArr {
    
    public class StackFullException extends Exception{
        public StackFullException(String msg){
            super(msg);
        }
    }
    
    public class StackEmptyException extends Exception{
        public StackEmptyException(String msg){
            super(msg);
        }
    }
    
    private final int[] arr;
    private int top;
    public StackArr(int capacity){
        top = -1;
        arr = new int[capacity];
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public int length(){
        return top + 1;
    }
    
    public void print(){
        
        if(top < 0){
            System.out.print("Stack is empty.");
            return;
        }
        
        for(int i= 0; i<= top; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
    public int peek() throws StackEmptyException{
        if(top == -1)
            throw new StackEmptyException("Stack is empty.");
        
        return arr[top];
    }
    
    public void push(int val) throws StackFullException{
        if(arr.length == top + 1)
            throw new StackFullException("Stack Size Full: Stack has reached its limit.");
        
        arr[++top] = val;
    }
    
    public int pop() throws StackEmptyException{
        if(isEmpty())
            throw new StackEmptyException("Stack is empty.");
        
        return arr[top--];
    }
    
    public static void main(String args[]){
        StackArr s = new StackArr(3);
        
        System.out.println("isEmpty: " + s.isEmpty());
        System.out.println("Capacity: " + s.length());
        
        try{ 
            
            s.pop();
            s.push(91);
            System.out.println("---"+ s.peek()); 
            s.push(42);
            System.out.println("---"+ s.peek()); 
            s.push(63);
            System.out.println("---"+ s.peek()); 
            s.push(4);
            
            s.pop();
            s.print();
            
            s.pop();
            s.print();
            
            
            s.pop();
            s.print();
            
            s.pop();
            
        }
        catch(StackEmptyException | StackFullException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println();
    }
}
