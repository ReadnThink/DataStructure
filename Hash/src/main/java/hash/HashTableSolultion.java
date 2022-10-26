package hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashTableSolultion {

    class Node{
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
        public String getKey(){
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    List<Node>[] table = new ArrayList[1000];

    public int hash(String key){
        int asciisum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciisum += key.charAt(i);
        }
        // return값이 % size인 이유 = 방번호를 배정하는 것이다.
        // 1. 지정된 크기의 배열의 값을 저장하기 떄문이다.
        // 2. size로 정한 배열의 어딘가로 가도록 하기 위함.
        return asciisum % 1000;
    }

    public void insert(String key, Integer value){
        //list
        int hashIdx = hash(key);
        if(this.table[hashIdx] == null){
            this.table[hashIdx] = new ArrayList<>();
        }
        //map, object
        this.table[hashIdx].add(new Node(key, value));
    }
    public Integer get(String key){
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if(key.equals(node.getKey())){
                return node.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTableSolultion hs = new HashTableSolultion();
        hs.insert("Yoonseo", 1);
        hs.insert("Seoyoon", 2);

        int result = hs.get("Yoonseo");
        int result2 = hs.get("Seoyoon");

        if(result == 1){
            System.out.println("테스트 성공");
        }else{
            System.out.println("테스트 실패");
        }
        if(result2 == 2){
            System.out.println("테스트 성공");
        }else{
            System.out.println("테스트 실패");
        }

    }
}
