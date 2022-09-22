import java.util.ArrayList;

/**
 * This class is used to create stack objects throughout programs 
 */
public class SamiStack
{
    ArrayList<Integer> stack = new ArrayList<>(); // List that will be used to act as a stack
    
    /**
     * Push method for a stack object
     */
    public void push(int value) { 
        stack.add(value);
    }
    
    /**
     * Pop method for a stack object
     */
     public void pop() {
         if (stack.size() > 0)
            stack.remove(stack.size() - 1);
        else
            System.out.println("Empty Stack. Cannot pop!");
     }
     
     /**
      * Peek method for a stack object
      */
      public int peek() {
        if (stack.size() > 0)
            return stack.get(stack.size() - 1);
        else {
            System.out.println("Empty Stack. Cannot peek!");
            return -1;
        }
      }
}