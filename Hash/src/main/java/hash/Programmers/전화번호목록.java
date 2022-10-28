package hash.Programmers;

import java.util.HashSet;

public class 전화번호목록 {
    /*
     * O(N^2)으로 코딩하면
     * phone_book 으로 반복 // 100만
     * phone_book 으로 반복 // 100만
     * indexOf로 판별 // 100만 * 100만
     * */
    public static boolean solution(String[] nums) {
        HashSet<String> hs = new HashSet<>();
        //  (/)인경우에는 int || float,double나올 수 있기 때문에 사용 자제
        for(String num : nums) hs.add(num);

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < hs.size(); j++) {
//                if (nums[i].equals(hs.contains(nums[j]))) {
//                    return true;
//                }
//            }
//        }
        for (String num : nums) {
            for (int i = 0; i < num.length(); i++) {// 왜 이게 O(N^2) 이 아닌가 phone_book 최대 100만
                if(hs.contains(num.substring(0,i)))return false;// 전화번호의 최대 길이는 20 이기 때문에
            }
        }
        return true;
    }

        public static void main(String[] args) {
            String[] nums = {"119", "97674223", "1195524421"};
            String[] nums1 = {"123", "456", "789"};
            String[] nums2 = {"12", "123", "1235", "567", "88"};
            전화번호목록 phone_book = new 전화번호목록();
            System.out.println(phone_book.solution(nums));
            System.out.println(phone_book.solution(nums1));
            System.out.println(phone_book.solution(nums2));

        }
    }

