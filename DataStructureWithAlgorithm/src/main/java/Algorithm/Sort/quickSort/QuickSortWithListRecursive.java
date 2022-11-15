package Algorithm.Sort.quickSort;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortWithListRecursive {
    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right){
//        System.out.println("left = " + left);
//        System.out.println("right = " + right);
//        System.out.println("mid = " + mid);
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);
//        System.out.println("merge = " + answer);
        return answer;
    }
    public List<Integer> sort(List<Integer> arr){
        if(arr.size() <= 1) return arr; //탈출조건 비어있거나 사이즈가 1인 arr가 들어오면 바로 리턴한다.

        int pivot = arr.get(arr.size() / 2);
//        System.out.println("pivoit = " + pivot);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++){
            if(arr.get(i) < pivot) left.add(arr.get(i));
            else if(arr.get(i)> pivot) right.add(arr.get(i));
            else mid.add(arr.get(i)); //피벗값 넣어주는것
        }

//        System.out.println("left = " + left);
//        System.out.println("right = " + right);
//        System.out.println("mid = " + mid);
        return merge(sort(left), mid, sort(right));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50}; //배열
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) arrList.add(arr[i]); //list로 전환하여 sort함수에 전달

        QuickSortWithListRecursive q = new QuickSortWithListRecursive();
        //sort전 배열
        System.out.println("Original"+Arrays.toString(arr));
        //sort후 배열
        System.out.println("answer = "+ q.sort(arrList));
    }
}
