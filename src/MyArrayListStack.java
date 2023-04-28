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
}
