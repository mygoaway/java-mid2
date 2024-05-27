package collection.iterable;

import java.util.Iterator;

public class MyArrayMain{
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }

        // 추가
        System.out.println("for-each 사용"); // 배열 또는 Iterable 을 구현한 클래스는 forEach를 사용할 수 있게 해준다.
        for(int value : myArray) {
            System.out.println("value = " + value);
        }
    }
}

