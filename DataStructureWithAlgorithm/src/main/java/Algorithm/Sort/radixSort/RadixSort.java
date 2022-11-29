package Algorithm.Sort.radixSort;

import java.util.*;

public class RadixSort {

    public static int[] getDigits(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            //중복제거 자리수구하기
            if(nums[i] == 0) set.add(1); //자리수이니 0 은 1의자리 1이다. // 0은 로그로 자리수를 구할 수 없음
            else set.add((int) (Math.log10(nums[i]) + 1));
        }
        //중복 제거된 자리수를 arr에 담기
        int[] answer = new int[set.size()];
        int idx = 0;
        for (Integer integer : set) {
            answer[idx++] = integer;
        }
        Arrays.sort(answer);
        return answer;
    }
    public static int[] sort(int[] nums, int digit) {
        //Queue 10개 생성 i가 자리수가된다. 0 = 1의자리 1 = 10의자리 2 = 100의자리 ...
        Queue<Integer>[] queue = new Queue[10];
        for (int i = 0; i < queue.length; i++) {
            queue[i] = new ArrayDeque<>();
        }
        //자릿수에 맞게 queue에 넣기 1, 10, 100 ...
        for (int i = 0; i < nums.length ; i++) {
            int divisor = (int) Math.pow(10, digit - 1); // 10의 0제곱이므로 1의자리
            queue[Math.floorDiv(nums[i], divisor) % 10].add(nums[i]);
        }

        // queue에서 꺼내서 arr로 만들기
        int idx = 0;
        for (int i = 0; i < queue.length; i++) { // queueArr을 반복 합니다.
            while(!queue[i].isEmpty()){
                nums[idx++] = queue[i].poll();
            }
        }

        return nums;

    }
    public static void main(String[] args) {

        int[] arr = new int[]{7, 4, 5, 9, 30, 1, 300, 0, 20};
        int[] digits = getDigits(arr);

        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(arr));
        for (int digit : digits) {
            arr = sort(arr, digit);
            System.out.println(Arrays.toString(arr));
        }
    }
}
