package Queue;

import java.util.NoSuchElementException;

class Queue<T> {
    class Node<T> {
        private T data; //데이터 선언
        private Node<T> next; // 다음노드 선언

        public Node(T data) { //생성자에서 데이터 받아서 저장
            this.data = data;
        }
    }

    // 큐는 앞 뒤로 주소를 알고있어야 한다.
    private Node<T> first;
    private Node<T> last;

    // 추가 기능
    public void add(T item) {
        Node<T> t = new Node<T>(item);

        if (last != null) last.next = t; //마지막 노드가 있다면 add된 node가 마지막이 된다.
        last = t; // 추가된 t 노드가 마지막이 된다.
        if (first == null) first = last; //첫번째 노드가 비어있다면 add된 node가 처음이기 때문에 추가된 노드는 first이자 last가 된다.

    }

    //삭제기능
    public T remove() {
        if (first == null) throw new NoSuchElementException(); //큐가 비어있느면 삭제할 node가 없으므로 Error처리

        T data = first.data; //반환할 데이터를 백업
        first = first.next; //삭제하게되면 첫번째 노드는 삭제되고 두번째 노드가 첫전째 노드가 된다.

        if (first == null) last = null; // 첫번째가 비어있다면 마지막이므로 last도 비워준다.
        return data; // 저장한 첫번째 노드 반환
    }

    //확인기능
    public T peek() {
        if (first == null) throw new NoSuchElementException(); //first가 비어있으면 보여줄 것이 없다.
        return first.data; //첫번째 노드 보여준다.
    }

    // 비어있는지 확인
    public boolean isEmpty() {
        return first == null; // first가 null이면 true 아니면 false
    }
}


public class QueueT {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove()); // 1삭제
        System.out.println(q.remove()); // 2삭제
        System.out.println(q.peek()); // 확인만 한다. 3이나와야 정상
        System.out.println(q.remove()); // 3삭제
        System.out.println(q.isEmpty()); //확인
        System.out.println(q.remove()); //4삭제
        System.out.println(q.isEmpty()); // 확인

    }
}
