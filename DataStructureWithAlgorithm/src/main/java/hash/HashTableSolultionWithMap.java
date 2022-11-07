package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTableSolultionWithMap {
    int size = 10000;
    List<Map<String,Integer>>[] table = new ArrayList[size];

    public HashTableSolultionWithMap() {
    }

    public HashTableSolultionWithMap(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }
    //노드 말고 다른 방법이 있다.
    //Map으로 <String, Integer>로 가능하다.
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


    public int hash(String key){
        int asciisum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciisum += key.charAt(i);
        }
        // return값이 % size인 이유 = 방번호를 배정하는 것이다.
        // 1. 지정된 크기의 배열의 값을 저장하기 떄문이다.
        // 2. size로 정한 배열의 어딘가로 가도록 하기 위함.
        return asciisum % size;
    }

    public void insert(String key, Integer value){
        //list
        int hashIdx = hash(key);
        if(this.table[hashIdx] == null){
            this.table[hashIdx] = new ArrayList<>();
        }
        //map, object
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(key, value);
        this.table[hashIdx].add(hm);
    }
    public Integer get(String key){
        List<Map<String, Integer>> nodes = this.table[hash(key)];
        for (Map<String,Integer> node : nodes) {
//            // key가 일치하는지 확인하는 로직 필요
//            if(key.equals(node.)){
//                return node.value;
//            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTableSolultionWithMap hs = new HashTableSolultionWithMap();
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
