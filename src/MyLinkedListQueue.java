import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.LinkedList;
public class MyLinkedListQueue {
    //3. Declare an instance variable of type LinkedList
    private LinkedList myLinkedList;

    //4. Create a constructor for the class and initialize the instance variable
    public MyLinkedListQueue() {
        myLinkedList = new LinkedList();
    }

    //5. Implement the enqueue method that adds an element to the back of the queue
    public void enqueue(Object element) {
        myLinkedList.addLast(element);
    }

    //6. Implement the dequeue method that removes and returns the front element of the queue
    public Object dequeue() {
        if (myLinkedList.isEmpty()) {
            throw new EmptyStackException(); // Throw an exception if the stack is empty
        }
        // Remove and return the first element of the queue
        return myLinkedList.removeFirst();
    }
}
