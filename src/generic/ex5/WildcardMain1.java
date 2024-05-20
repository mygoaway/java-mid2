package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        catBox.set(new Cat("냐옹이", 100));
        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);
        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);
        // WildcardEx.printWildcardV2(objectBox); Object 클래스는 Animal 또는 Animal의 자식 클래스가 아니기 때문에 컴파일 에러 발생

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox); // 입력한 타입을 그대로 반환이 가능
        Cat cat = WildcardEx.printAndReturnGeneric(catBox); // 입력한 타입을 그대로 반환이 가능
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);

        Animal animal = WildcardEx.printAndReturnWildcard(dogBox); // 하지만, 와일드 카드를 이용한 메서드의 경우에는 부모 클래스 기준으로 받아짐
        System.out.println("animal = " + animal);

    }
}
