package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list = new ArrayList<>();

        // 빈 불변 리스트 생성
        List<Object> list2 = Collections.emptyList(); // 자바 5
        List<Object> list3 = List.of(); // 자바 9

        System.out.println("list2.getClass() = " + list2.getClass());
        System.out.println("list3.getClass() = " + list3.getClass());
    }
}
