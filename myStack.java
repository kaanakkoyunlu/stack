package Algorithms;

public class myStack {

    private int size;
    private int top;
    private int[] stackArr;

    public myStack(int size) {

        this.size=size;
        this.top=-1;
        this.stackArr = new int[size];
    }

    public void push(int value) {

        if(top<size-1) {

            stackArr[++top] = value;
            System.out.println(value + " pushed to stack");
        }
        else {
            System.out.println("stackoverflow");
        }
    }

    public int pop() {

        if(top>-1) {

            int val = stackArr[top--];
            return val;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }  
    }

    public int peek() {

        if(top>-1) {
            return stackArr[top];
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size-1;
    }

    public void displayStack() {

        if(!isEmpty()) {
            for(int i=top;i>=0;i--) {

                System.out.println(stackArr[i]);
            }
        }
        else {
            System.out.println("Stack is empty");
        }
    }

    public static void main(String[] args) {

        myStack stack = new myStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        stack.displayStack();
        

    }
}
