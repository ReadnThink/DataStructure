package hash;

public class HashFunction {
//    public int hash(String key){
//        int asciiSum = 0;
//        for (int i = 0; i < key.length(); i++) {
//            char c = key.charAt(i);
//            int ascii = c;
//            System.out.printf("%s %d\n" ,c, ascii);
//            asciiSum += ascii;
//        }
//        //문자열이 들어오면 하니씩 아스키코드로 변환하여 그 값들의 합을 리턴한다.
//        System.out.println("asciiSum :" + asciiSum);
//        return 0;
//    }
    public int hash(String key){
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        //문자열이 들어오면 하니씩 아스키코드로 변환하여 그 값들의 합을 리턴한다.
        return asciiSum % 90;
    }

    public static void main(String[] args) {
        HashFunction hashFunction = new HashFunction();
        int result = hashFunction.hash("Get over it");
        System.out.println( result);
    }
}
