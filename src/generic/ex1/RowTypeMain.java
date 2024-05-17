package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        // 로 타입 존재 이유는 제네릭 등장 이전의 자바 코드와의 호환을 위해서 존재함
        GenericBox genericBox = new GenericBox(); // <>를 지정하지 않는 경우 이런 것을 로 타입(row type)이라고 한다.
        // GenericBox<Object> genericBox1 = new GenericBox<>(); => 권장
        genericBox.set(10);
        Integer result = (Integer) genericBox.get();
        System.out.println("result = " + result);
    }
}
