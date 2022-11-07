package Stack.StacjArr;

import java.util.NoSuchElementException;

public class StackArray {
    private Integer[] arr;
    private int top = -1;

    public StackArray(){
        this.arr = new Integer[10000];
    }
    public StackArray(int size){
        this.arr = new Integer[size];
    }

    public Integer[] getArr(){
        return arr;
    }

    public void push(int item){
        if(isFull()) throw new ArrayIndexOutOfBoundsException("스택이 꽉차있습니다.");
        this.arr[++top] = item;
    }

    public int pop(){
        if(isEmpty()) throw new NoSuchElementException("스택이 비어있습니다.");
        return this.arr[top--];
    }

    public int peek(){
        if(isEmpty()) throw new NoSuchElementException("스택이 비어있습니다.");
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return this.top == this.arr.length - 1;
    }

}
