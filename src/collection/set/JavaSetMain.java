package collection.set;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        run(hashSet); // HashSet은 입력한 순서보장 X
        run(linkedHashSet); // LinkedHashSet은 입력한 순서보장 O
        run(treeSet); // TreeSet은 데이터 값 기준으로 정렬 보장 O
    }
    
    private static void run(Set<String> set) {
        System.out.println("set.getClass() = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
