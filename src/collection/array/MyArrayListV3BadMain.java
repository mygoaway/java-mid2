package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        // 숫자만 입력 하기를 기대했지만, Object를 받아서 저장하기 때문에 자바의 모든 타입을 저장할 수 있다.
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3");
        System.out.println(numberList);

        // Integer o = (Integer) numberList.get(2); => ClassCastException 발생

    }
}
