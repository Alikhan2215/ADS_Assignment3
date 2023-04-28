import java.util.EmptyStackException;
import java.util.ArrayList;
public class MyArrayListStack {
    //3. Declare an instance variable of type MyArrayList
    private ArrayList myArrayList;

    //4. Create a constructor for the class and initialize the instance variable.
    public MyArrayListStack() {
        myArrayList = new ArrayList();
    }

    //5. Implement the push method that adds an element to the top of the stack
    public void push(Object element) {
        myArrayList.add(element); // Add the element to the end of the ArrayList
    }

    //6. Implement the pop method that removes and returns the top element of the stack
    public Object pop() {
        if (myArrayList.isEmpty()) {
            throw new EmptyStackException(); // Throw an exception if the stack is empty
        }
        // Remove and return the last element of the ArrayList
        return myArrayList.remove(myArrayList.size() - 1);
    }
}
