package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    // 제네릭 메서드
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 와일드 카드
    static void printWildcardV1(Box<?> box) {
        System.out.println("T = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    // 상한 제네릭
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    // 상한 와일드 카드
    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

    // 와일드 카드 : 컴퓨터 프로그래밍에서 *, ? 와 같이 하나 이상의 문자들을 상징하는 특수 문자를 뜻한다.
    // 쉽게 이야기해서 여러 타입이 들어올 수 있다는 뜻이다.
    // 와일드 카드는 제네릭을 좀 더 편하게 사용하기 위한걸로 생각
}
