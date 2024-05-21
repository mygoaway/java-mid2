package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    // 제네릭 도입 => 타입 안전성
    private static final int DEFAULT_CAPACITY = 5;

    // Object [] 를 그대로 사용하는 이유
    // => 제네릭은 런타임에 이레이저에 의해 타입 정보가 사라진다. 따라서 런타임에 타입 정보가 필요한 생성자에 사용할 수 없다.
    // 따라서 제네릭을 기반으로 배열을 생성하는 다음 코드는 작동하지 않고, 컴파일 오류가 발생한다. => new E 생성 불가 => 제네릭 타입의 매개변수는 생성자에서 사용 불가
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E o) {
        // 코드 추가
        if(size == elementData.length) {
            grow();
        }

        elementData[size] = o;
        size++;
    }

    public void add(int index, E o) {
        // 코드 추가
        if(size == elementData.length) {
            grow();
        }

        // 데이터 이동
        shiftRightFrom(index);
        elementData[index] = o;
        size++;
    }

    private void shiftRightFrom(int index) {
        for(int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 코드 추가
    public E remove(int index) {
        E oldValue = (E) elementData[index];
        // 데이터 이동
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for(int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    public int indexOf(E o) {
        for(int i = 0; i < size; i++) {
            if(o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        // [1,2,3] // size = 3
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size = " + size + ", capacity = " + elementData.length;
    }
}
