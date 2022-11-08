package LinkedList;


class Node{
    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
    }

    void append(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d) {
        Node n = this;
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next; // 다음 노드 data가 삭제하려는 노드 data라면 현재 노드의 다음 노드를 다다음으로 변경
            } else {
                n = n.next; //아니면 end까지 반복
            }
        }
    }

    void retrieve() {
        Node n = this;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data); //다음 노드가 null이면 반복문을 조건성립 안되기때문에 출력
    }

}


public class LinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.retrieve();
        head.delete(3);
        head.retrieve();
        head.delete(2);
        head.retrieve();
    }
}
