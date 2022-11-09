package Algorithm.Sort;

import java.util.Arrays;

public class 선택정렬 {

    public static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void Selections(int[] nums){

        for(int i = 0; i < nums.length; i++){
            int min = nums[i];
            int index = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] < min){
                    min = nums[j];
                    index = j;
                }
            }
            if(index != 0) {
                swap(nums,i,index);
            }
        }
        for (int num : nums) {
            System.out.printf("%d ,",num);
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,4,9,10,223,111,23,3,39};
        Selections(nums);
    }
}
