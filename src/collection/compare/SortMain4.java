package collection.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        LinkedList<MyUser> users = new LinkedList<>();
        users.add(myUser1);
        users.add(myUser2);
        users.add(myUser3);

        System.out.println("기본 데이터");
        System.out.println(users);
        
        System.out.println("Comparable 기본 정렬");
        users.sort(null); // 권장, 별도의 비교자가 없으므로 Comparable로 비교해서 정렬
        //Collections.sort(users);
        System.out.println(users);

        System.out.println("IdComparator 정렬");
        users.sort(new IdComparator());
        //Collections.sort(users, new IdComparator());
        System.out.println(users);
    }
}
