package collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set1 = new MyHashSetV3<>(10);
        set1.add("jay");
        set1.add("audrey");
        set1.add("C");
        set1.add("c");
        set1.add("D");
        set1.add("E");
        System.out.println("set1 = " + set1);

        boolean contains1 = set1.contains("jay");
        System.out.println("contains1 = " + contains1);

        boolean remove1 = set1.remove("jay");
        System.out.println("remove1 = " + remove1);

        MySet<Integer> set2 = new MyHashSetV3<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        System.out.println("set2 = " + set2);

        boolean contains2 = set2.contains(1);
        System.out.println("contains2 = " + contains2);

        boolean remove2 = set2.remove(1);
        System.out.println("remove2 = " + remove2);
        System.out.println("set2 = " + set2);

    }
}
