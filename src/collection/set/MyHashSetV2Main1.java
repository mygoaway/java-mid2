package collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("jay");
        set.add("audrey");
        set.add("C");
        set.add("c");
        set.add("D");
        set.add("E");
        System.out.println(set);

        boolean contains1 = set.contains("jay");
        System.out.println("contains1 = " + contains1);

        boolean remove1 = set.remove("jay");
        System.out.println("remove1 = " + remove1);
    }
}
