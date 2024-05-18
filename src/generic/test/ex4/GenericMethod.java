package generic.test.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    // 제네릭 메서드
    public static <T> T genericMethod(T t) {
        System.out.println("Generic print = " + t);
        return t;
    }

    // 제네릭 메서드
    // 타이 매개변수를 Number로 제한했다. 따라서 Number와 그 자식만 받을 수 있다.
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print = " + t);
        return t;
    }

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(1);

        System.out.println("명시적 타입 인자전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        String str = GenericMethod.<String>genericMethod("문자열"); // 타입 추론이 가능하다.
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        Integer result1 = GenericMethod.genericMethod(i);
        String str1 = GenericMethod.genericMethod("문자열"); // 타입 추론이 가능하다.
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);
    }
}
