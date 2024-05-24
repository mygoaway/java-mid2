package collection.array.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while(true) {
            int number = scanner.nextInt();
            if( number == 0 ) {
                break;
            } else {
                numbers.add(number);
            }
        }

        int total = 0;
        for (Integer integer : numbers) {
            total += integer;
        }

        double average = (double) total / numbers.size();
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 점수의 평균: " + average);
    }
}
