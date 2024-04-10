
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

class test{
    public static void main(String[] args){
      Queue<String> queue = new LinkedList<>();
      queue.add("a");
      queue.add("b");
      queue.add("c");

      // add "z" at the start of the queue
      queue.add("z");
      
      
      System.out.println(queue);

    }
}