package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 배열을 List로 변환 => List.of(배열) = > 반환 타입 List<Integer>
        // List<Integer> inputArr = List.of(inputArr); => 권장
        // List<Integer> inputArr = Arrays.asList(30, 20, 20, 10, 10);
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));


        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
