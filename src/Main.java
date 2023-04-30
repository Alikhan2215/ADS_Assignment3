public class Main {
    public static void main(String[] args) {
        MyArrayListStack stack = new MyArrayListStack();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.stackSize());
        System.out.println("Stack top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size after popping one element: " + stack.stackSize());

        System.out.println("QUEUE CHECK");
        MyLinkedListQueue queue = new MyLinkedListQueue();

        System.out.println("Queue size: " + queue.queueSize());
        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue size: " + queue.queueSize());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}