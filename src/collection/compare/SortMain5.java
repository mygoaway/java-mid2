package collection.compare;

import java.util.LinkedList;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        // TreeSet, TreeMap 은 Comparable 또는 Comparator가 필수적이다.
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> users = new TreeSet<>();
        users.add(myUser1);
        users.add(myUser2);
        users.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println("users = " + users);

        TreeSet<MyUser> users2 = new TreeSet<>(new IdComparator());
        users2.add(myUser1);
        users2.add(myUser2);
        users2.add(myUser3);
        System.out.println("Comparator 정렬");
        System.out.println("users2 = " + users2);
    }
}
