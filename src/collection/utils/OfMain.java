package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        // 편리한 불변 컬렉션
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "One", 2, "Two");

        // 값을 추가하거나 삭제하는 경우 컴파일 에러 발생
        //list.remove(1);
        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list.getClass() = " + list.getClass());
        // list.getClass() = class java.util.ImmutableCollections$ListN
    }
}
