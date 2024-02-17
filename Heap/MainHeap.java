import java.util.ArrayList;

public class MainHeap {
    public static void main(String[] args) throws  Exception{
        Heap<Integer> heap = new Heap<>();
        heap.insertInMax(16);
        heap.insertInMax(14);
        heap.insertInMax(10);
        heap.insertInMax(8);
        heap.insertInMax(7);
        heap.insertInMax(9);
        heap.insertInMax(3);
        heap.insertInMax(2);
        heap.insertInMax(4);

        heap.display();

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
    }
}
