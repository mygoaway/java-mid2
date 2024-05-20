package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMethod {

    public static <T extends Animal> void checkUp(T t) {
        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 사이즈: " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T bigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.checkUp(dog); // <Dog>는 타입 추론으로 생략 가능
        AnimalMethod.checkUp(cat);

        Animal biggerAnimal = AnimalMethod.bigger(dog, new Dog("멍멍이2", 200));
        System.out.println("biggerAnimal = " + biggerAnimal);
    }
}
