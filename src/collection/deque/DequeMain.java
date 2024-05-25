package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeMain {
    public static void main(String[] args) {
        // ArrayDeque vs LinkedList => ArrayDeque 가 모든 면에서 빠르다.
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(1);
        System.out.println("queue = " + deque);
        deque.offerFirst(2);
        System.out.println("queue = " + deque);
        deque.offerLast(3);
        System.out.println("queue = " + deque);
        deque.offerLast(4);
        System.out.println("queue = " + deque);


        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("queue.peekFirst() = " + deque.peekFirst());
        System.out.println("queue.peekLast() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("queue.pollFirst() = " + deque.pollFirst());
        System.out.println("queue.pollFirst() = " + deque.pollFirst());
        System.out.println("queue.pollLast() = " + deque.pollLast());
        System.out.println("queue.pollLast() = " + deque.pollLast());
        System.out.println("queue = " + deque);
    }
}
