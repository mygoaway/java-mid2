package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 다음 꺼낼 요소 확인(거내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());

        // 자바의 Stack 클래스는 내부에서 Vector라는 자료 구조를 사용하는데, Vector는 자바 1.0에 개발
        // 지금은 사용되지 않고 하위 호환을 위해 존재한다. 지금은 더 빠른 자료 구조가 많다.
        // 따라서 Vector를 사용하는 Stack도 사용하지 않는 것을 권장. 대신 이후에 설명할 Deque를 사용하는것이 좋다.
    }
}
