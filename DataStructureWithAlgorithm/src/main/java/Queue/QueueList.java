package Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class QueueList {
        //FIFO
        static class myQueue {
            private List<Integer> queue = new ArrayList<>();

            //1. add
            public void add(Integer item){
                queue.add(item);
            }

            //2. remove
            public Integer remove(){
                if(isEmpty()) {
                    System.out.println("Queue가 비어있습니다.");
                    throw new NoSuchElementException();
                }
                return queue.remove(0); //첫번째 원소를 지운다.
            }
            //3. peek
            public Integer peek(){
                if(isEmpty()){
                    System.out.println("Queue가 비어있습니다.");
                    throw new NoSuchElementException();
                }
                return queue.get(0);
            }
            //4. isEmpty
            public boolean isEmpty(){
                if(queue.size() <= 0) return true;
                return false;
            }
        }
    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }
}
