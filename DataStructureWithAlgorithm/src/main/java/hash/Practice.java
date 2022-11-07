package hash;

public class Practice {
    private int size = 10000;
    private int[] table = new int[size];

    public Practice() {
    }

    public Practice(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String arr){
        int asciiSum = 0;
        for (int i = 0; i < arr.length(); i++) {
            asciiSum += arr.charAt(i);
        }
        return asciiSum % arr.length();
    }

    public void insert(String key, int value){
        table[hash(key)] = value;
    }
    public int search(String key){
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        System.out.println(practice.hash("SolbaeKim"));
    }
}
