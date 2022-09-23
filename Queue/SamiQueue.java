import java.util.ArrayList;

/**
 * This class acts as a queue object
 */ 
public class SamiQueue 
{
    ArrayList<Integer> queue = new ArrayList<>(); // ArrayList used to store data inside the queue
     
    /**
     * Method used to push to queue
     */ 
     public void push(int val) {
         queue.add(0, val);
     }
     
     /**
      * Method used to pop from queue
      */ 
      public void pop() {
          if (queue.size() > 0) 
            queue.remove(queue.size() - 1);
          else
            System.out.println("Empty Queue! Cannot pop!");
      }
      
      /**
       * Method used to peek at Queue
       */ 
       public int peek() {
          int val = -1;
          if (queue.size() > 0) 
            val = queue.get(queue.size() - 1);
          else
            System.out.println("Empty Queue! Cannot peek!");
          return val;
       }
}