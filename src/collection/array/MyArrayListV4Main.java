package collection.array;

import java.util.ArrayList;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string = " + string);


        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);

        // 배열, 리스트는 순서대로 마지막에 데이터를 추가하거나 삭제할 때는 성능이 좋지만,
        // 앞이나 중간에 데이터를 추가하거나 삭제할 때는 성능이 좋지 않다.
        // 이런 단점을 해결한 자료 구조인 링크드 리스트(LinkedList)에 대해서 알아보자.
    }
}
