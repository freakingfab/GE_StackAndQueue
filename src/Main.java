import com.bridgelabz.stackandqueue.Queue;
import com.bridgelabz.stackandqueue.Stack;
public class Main {
    public static void main(String[] args) {
        System.out.println("Implementing Stack using Linked List");
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element in stack: " + stack.peek());
        stack.pop();
        System.out.println("Top element in stack after pop: " + stack.peek());

        System.out.println("Implementing Queue using Linked List");
        Queue<Integer> queue = new Queue();
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
    }
}