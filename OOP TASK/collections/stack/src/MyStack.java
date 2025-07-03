public class MyStack {
    private String[] myStack;
    private int counter;
    private boolean isEmpty;

    public MyStack(int size) {
        myStack = new String[size];
        this.counter = 0;
        this.isEmpty = true;

    }
    public boolean isEmpty() {
        return counter == 0;
    }

    public void push(String s) {
        myStack[counter++] = s;
    }

    public String pop() {
        //if (isEmpty())throw new StackUnderFlowException();
        return myStack[--counter];
    }
}

