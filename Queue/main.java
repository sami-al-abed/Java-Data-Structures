
public class Main
{
    public static void main(String[] args) {
        SamiQueue queue = new SamiQueue();
        queue.push(2);
        System.out.println(queue.peek()); //2
        queue.push(3);
        queue.push(4);
        System.out.println(queue.peek()); //2
        queue.pop();
        System.out.println(queue.peek()); //3
        queue.pop();
        queue.pop();
        System.out.println(queue.peek());
        queue.pop();
    }
}
