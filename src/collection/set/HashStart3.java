package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println(Arrays.toString(inputArray));
        
        int searchValue = 99;
        Integer result = inputArray[searchValue]; // 0(1)
        System.out.println("result = " + result);
        // 데이터의 값을 인덱스로 사용한 덕분에 0(1)의 매우 빠른 검색 속도를 얻을 수 있었다.
        // 하지만, 낭비되는 메모리 공간이 너무 많다.
    }
}
