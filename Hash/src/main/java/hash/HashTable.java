package hash;

import java.util.HashSet;
import java.util.Set;

public class HashTable {
    public int size = 10000;
    private int[] table = new int[size];

    public HashTable() {
    }

    public HashTable(int size){
        this.size = size;
        this.table = new int[size];
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
        int hashCode = hash(key);
        this.table[hash(key)] = value;
        System.out.println(hashCode + "방에 저장이 완료되었습니다.");
    }
    public int search(String key){
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"Yoonseo","Seoyoon","DongyeonKang","SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashTable hashTable = new HashTable(200); // 충돌아 안나게 넉넉하기 잡는게 좋다.
        for (int i= 0; i < names.length; i++) {
            hashTable.insert(names[i], hashTable.hash(names[i]));
        }
        //동일한 Ascii값이나와 같은 방을 할당받아 충돌이 일어남.
        System.out.println(hashTable.search("DongyeonKang"));
        System.out.println(hashTable.search("JiyoungAhn"));
    }
}
