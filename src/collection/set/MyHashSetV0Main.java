package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();

        set.add(1); // 0(1)
        set.add(2); // 0(n)
        set.add(3); // 0(n)
        set.add(4); // 0(n)
        set.add(5); // 0(n) => 데이터를 넣을때마다 요소가 포함되었는지 확인이 필요해서 성능이 안좋다.
        System.out.println(set);

        boolean result = set.add(4);
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3)); // 0(n)
        System.out.println("set.contains(99) = " + set.contains(99)); // 0(n)
    }
}
