package generic.ex3;

import generic.animal.Animal;

// Animal 또는 그 자식 클래스만 넣을 수 있다.
public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 사이즈: " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
