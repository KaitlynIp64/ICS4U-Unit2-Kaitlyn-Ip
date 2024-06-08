/**
 * The KaiStack class.
 *
 * @author Kaitlyn Ip
 * @version 1.0
 * @since 2024-03-22
 */

final class KaiStack {

    /**
     * The main() method.
     *
     * @param args The command line arguments
     */
    private String[] stack;

    /**
     * Creates an empty stack.
     */
    final KaiStack() {
        stack = new String[0];
    }

    /**
     * Pushes an item onto the stack.
     *
     * @param item The item to push
     */
    public void push(String item) {
        final String[] newStack = new String[stack.length + 1];
        for (int counter = 0; counter < stack.length; counter++) {
            newStack[counter] = stack[counter];
        }
        newStack[newStack.length - 1] = item;
        stack = newStack;
    }

    /**
     * Pops the item out of the stack.
     */
        public String pop() {
            // Return top of the stack
        String returnValue = "";

        if (!stackAsList.isEmpty()) {
            String topItem = stackAsList.remove(stackAsList.size() - 1);
                returnValue = topItem;
        } else {
            returnValue = "The stack is empty!";
        }

	    return returnValue;
        }

    /**
     * Shows the stack.
     *
     * @return The stack
     */
    public String show() {
        String values = "";
        for (int counter = 0; counter < stack.length; counter++) {
            values += stack[counter];
            if (counter < stack.length - 1) {
                values += ", ";
            }
        }
        values += "";
        return values;
    }
}
