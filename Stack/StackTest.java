public class StackTest
{
    public static void main(String[] args) {
        SamiStack stack = new SamiStack();
        stack.push(2);
        System.out.println(stack.peek());
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
    }
}
