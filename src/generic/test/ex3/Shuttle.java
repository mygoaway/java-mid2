package generic.test.ex3;

import generic.test.ex3.Unit.BioUnit;

// 상한 제네릭 타입
public class Shuttle<T extends BioUnit> {
    private T value;

    public void in(T t) {
        this.value = t;
    }

    public T out() {
        return value;
    }

    public void showInfo() {
        System.out.println("이름 : " + value.getName() + ", 체력 : " + value.getHp());
    }
}
