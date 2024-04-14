/**
 * Class that defines a string stack.
 *
 * @author Kaitlyn Ip
 * @version 1.0
 * @since 2024-01-01
 */
public class KaiStack {
    private String[] strstack;

    // Constructor
    public KaiStack() {
        this.strstack = new String[0];
    }

    // Checks if stack is empty
    public boolean isEmpty() {
        return this.strstack.length == 0;
    }

    // Returns the top item of the stack
    public String peek() {
        if (this.strstack.length > 0) {
            return this.strstack[this.strstack.length - 1];
        } else {
            return null; // Return null or throw an exception when stack is empty
        }
    }

    // Returns stack size
    public int size() {
        return this.strstack.length;
    }

    // Shows full stack separated by commas
    public String show() {
        if (this.strstack.length > 0) {
            StringBuilder values = new StringBuilder();
            for (int i = 0; i < this.strstack.length; i++) {
                values.append(this.strstack[i]);
                if (i < this.strstack.length - 1) {
                    values.append(", ");
                }
            }
            return values.toString();
        } else {
            return "stack is empty";
        }
    }

    // Clears all items off the stack
    public void clear() {
        this.strstack = new String[0];
    }

    // Pushes an item to the end of the stack
    public void push(String input) {
        String[] newStack = new String[this.strstack.length + 1];
        System.arraycopy(this.strstack, 0, newStack, 0, this.strstack.length);
        newStack[this.strstack.length] = input;
        this.strstack = newStack;
    }

    // Pops an item from the end of the stack and returns its value
    public String pop() {
        if (this.strstack.length > 0) {
            String removed = this.strstack[this.strstack.length - 1];
            String[] newStack = new String[this.strstack.length - 1];
            System.arraycopy(this.strstack, 0, newStack, 0, this.strstack.length - 1);
            this.strstack = newStack;
            return removed;
        } else {
            return "nothing to remove"; // Return a message or throw an exception when stack is empty
        }
    }
}
