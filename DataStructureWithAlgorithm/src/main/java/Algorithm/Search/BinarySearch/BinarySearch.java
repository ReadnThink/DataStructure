package Algorithm.Search.BinarySearch;

public class BinarySearch {

    public static int myBinarySearch(int[] nums, int target){

        int start = 0;
        int last = nums.length - 1;
        int middle;
        //중간값 찾기
        middle = (start + last) / 2;

        //같은지 비교하기
        if(nums[middle] == target) return middle;

        //인덱스 옮기기
        if(nums[middle] > target){
            start = middle + 1;
        } else if (nums[middle] < target) {
            last = middle - 1;
        }
        myBinarySearch(nums, target);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11};
    }
}
