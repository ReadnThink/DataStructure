package Algorithm.Sort;

import java.util.Arrays;

interface UpAndDwon{
    boolean apply(int num, int j);
}

class Up implements UpAndDwon{

    @Override
    public boolean apply(int num, int j) {
        return num < j;
    }
}
class Down implements UpAndDwon{

    @Override
    public boolean apply(int num, int j) {
        return num > j;
    }
}



public class 선택정렬Templat {

    public static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void SelectionTemplat(int[] nums, UpAndDwon upAndDwon){

        for(int i = 0; i < nums.length; i++){
            int minAndMax = nums[i];
            int index = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if(upAndDwon.apply(nums[j], minAndMax)){
                    minAndMax = nums[j];
                    index = j;
                }
            }
            if(index != 0) {
                swap(nums,i,index);
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,4,9,10,223,111,23,3,39};

        System.out.println("interface적용 class 생성 후 new를 통해 구현");
        SelectionTemplat(nums, new Up());
        SelectionTemplat(nums, new Down());
        // class없이 바로 인터페이스 Up 구현체 생성
        System.out.println("Class없이 인터페이스 Up 생성");
        SelectionTemplat(nums, new UpAndDwon() {
            @Override
            public boolean apply(int num, int j) {
                return num < j;
            }
        });
        // lamda로 Down 생성
        System.out.println("lamda로 Down 생성");
        SelectionTemplat(nums,(num, j) -> {
            return num > j;
        });

    }
}
