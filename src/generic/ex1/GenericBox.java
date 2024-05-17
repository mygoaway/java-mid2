package generic.ex1;

public class GenericBox<T> {
    // <> 사용한 클래스 -> 제네릭 클래스
    // 제네릭을 사용하면 코드 재사용과 타입 안전성이라는 두 마리 토끼를 한 번에 잡을 수 있다.
    // T를 타입 매개변수라고 한다. 타입은 미리 결정하지 않고, 클래스를 인스턴스화 하는 시점에 적용된다.
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
