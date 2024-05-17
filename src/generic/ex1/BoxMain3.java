package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점에 T의 타입 결정, Intger / String 등이 타입 인자(인수)
        integerBox.set(10);
        //integerBox.set("문자100"); // Integer 타입만 허용, 컴파일 오류
        Integer integerValue = integerBox.get(); // Integer 타입 반환(캐스팅 x)
        System.out.println("integerValue = " + integerValue);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("hello");
        //stringGenericBox.set(100);
        String str = stringGenericBox.get();
        System.out.println("str = " + str);

        // Double 타입도 가능 => 원하는 모든 타입 사용 가능. 단, 기본형은 불가해서 래퍼형으로 적용해야 함
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerGenericBox = new GenericBox<>(); // <Integer> 대신 <>로 대체
    }
}
