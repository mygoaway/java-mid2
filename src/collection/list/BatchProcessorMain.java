package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {

        BatchProcessor arrayList = new BatchProcessor(new MyArrayList<>());
        arrayList.logic(50_000); // 1.4초

        BatchProcessor linkedList = new BatchProcessor(new MyLinkedList<>());
        linkedList.logic(50_000); // 0.002초
    }
}
