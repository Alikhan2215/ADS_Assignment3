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
            throw new NoSuchElementException(); // Throw an exception if there is no such element
        }
        // Remove and return the first element of the queue
        return myLinkedList.removeFirst();
    }

    //7. Implement the peek method that returns the front element of the queue without removing it
    public Object peek() {
        if (myLinkedList.isEmpty()) {
            throw new NoSuchElementException(); // Throw an exception if there is no such element
        }
        // Return the first element of the queue
        return myLinkedList.getFirst();
    }

    //8. Implement the isEmpty method that returns true if the queue is empty or false if it is not
    public boolean isEmpty() {
        // Return the result
        return myLinkedList.isEmpty();
    }

    //9. Implement the size method that returns the number of elements in the queue
    public int queueSize() {
        // Return the result
        return myLinkedList.size();
    }
}
