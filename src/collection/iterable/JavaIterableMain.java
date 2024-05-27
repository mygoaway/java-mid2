package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> listIterator = list.iterator(); // 자료 구조 타입에 맞는 Iterator 구현체를 반환한다.
        printAll(listIterator);
        forEach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer> setIterator = set.iterator(); // 자료 구조 타입에 맞는 Iterator 구현체를 반환한다.
        printAll(setIterator);
        forEach(set);
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator 출력");
        System.out.println("iterator = " + iterator.getClass());
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void forEach(Iterable<Integer> iterable) {
        // List / Set => forEach 사용할 수 있는 이유 => Iterable 인터페이스를 구현했기 때문에
        System.out.println("forEach 출력");
        System.out.println("iterable = " + iterable.getClass());
        for (Integer integer : iterable) {
            System.out.println(integer);
        }
    }
}
