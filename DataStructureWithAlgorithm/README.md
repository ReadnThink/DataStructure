# Hash

- Key,Value로 구성되는 모든 자료구조에 사용된다.
- indexOf로 roop를 돌때 시간복잡도가 너무 오래걸리기때문에 해쉬를 사용하면 빠르게 해결 할 수 있다.
## 시간복잡도 : O(n)
- 함수에서 리턴된 값을 가지고 배열에 접근하기 때문에 속도는 O(n)이다.
## 해쉬 장점
- Key값만 있다면 별다른 탐색없이 바로 원하는 값을 알 수 있다.
  - 해쉬를 안쓰면 배열을 돌면서 원하는 값을 찾을때까지 계속 찾아야 한다.
## 해쉬 충돌
- 같은 값이 들어있다면, 리턴되는 값이 똑같기 때문에 충돌이 일어난다.<br>
ex) Seoyoon, Yoonseo = Hash()가 리턴하는 아스키코드의 합이 같아서 충돌.

```
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
```

## 해결 방법
1. 

# Hash vs HashTable
Hash → 자체는 특정 값을 리턴하는 함수(메소드)<br>
HashTable → Hash를 써서 값에 접근하는 자료구조
