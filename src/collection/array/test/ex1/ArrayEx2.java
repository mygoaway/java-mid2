package collection.array.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayEx2 {
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

        System.out.println("출력");
        for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if(i != numbers.size() - 1) {
                System.out.print(", ");
            }
        }


    }
}
