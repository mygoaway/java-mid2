package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println(Arrays.toString(inputArray));

        // 문제의 핵심은 찾기 성능이 0(n)이다.
        // 0(n)을 0(1)로 하는 방법이 존재한다. 무엇일까??
        int searchValue = 8;
        for (Integer integer : inputArray) {
            if(searchValue == integer) {
                System.out.println(integer);
            }
        }
    }
}
