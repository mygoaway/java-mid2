package collection.set;

import collection.set.Member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        // 따라서 각각의 인스턴스마다 서로 다른 값을 반환
        Object o = new Object();
        Object j = new Object();
        System.out.println("j.hashCode() = " + j.hashCode());
        System.out.println("o.hashCode() = " + o.hashCode());

        // 각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());

         // hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까? 인스턴스는 다르지만, equals는 같다. => 오버라이딩을 했기 때문에
        Member memberA = new Member("idA");
        Member memberB = new Member("idA");
        System.out.println(memberA == memberB); // false, 동일성(identity)
        System.out.println(memberA.equals(memberB)); // true, 동등성(Equality)
        System.out.println(memberA.hashCode() == memberA.hashCode()); // true
    }
}
