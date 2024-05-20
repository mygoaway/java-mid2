package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class ComplexBox <T extends Animal>{
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    // 제네릭 타입보다 제네릭 메서드의 우선 순위가 높다.
    // ComplexBox 인스턴스 생성시 Dog로 하더라도 printAndReturn 메서드 호출시 Cat을 넣어도 상관은 없다.
    // 프로그래밍에서 모호한 것은 좋지 않다. 둘의 이름이 겹치면 아래와 같이 T, Z 로 분리하는 것이 좋다.
    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className : " + animal.getClass().getName());
        System.out.println("t.className : " + z.getClass().getName());
        return z;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat findCat = hospital.printAndReturn(cat);
        System.out.println("findCat = " + findCat);
    }
}
