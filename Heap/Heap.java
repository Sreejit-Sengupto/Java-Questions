import java.util.ArrayList;

public class Heap <T extends Comparable<T>>{
    private ArrayList<T> list;

    public Heap (){
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index -1) / 2;
    }

    private int left (int index) {
        return 2 * index + 1;
    }
    private int right (int index) {
        return 2 * index + 2;
    }

    private void maxHeap (int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);

        // If current element is greater than the parent element, then swap them
        if (list.get(index).compareTo(list.get(p)) > 0) {
            swap(index, p);
            maxHeap(p);
        }
    }

    private void minHeap (int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        // If current element is less than the parent element, then swap them
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            minHeap(p);
        }
    }

    // For Max Heap
    private void downHeap (int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) < 0) {
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) < 0) {
            min = right;
        }

        if (index != min) {
            swap(index, min);
            downHeap(min);
        }
    }

    public void display () {
        System.out.println(list);
    }

    // Max Heap
    public void insertInMax (T value) {
        list.add(value);
        maxHeap(list.size() - 1);
    }

    public void insertInMin (T value) {
        list.add(value);
        minHeap(list.size() - 1);
    }

    public T remove () throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap");
        }

        T rootEle = list.getFirst();
        T lastEle = list.getLast();

        if (!list.isEmpty()) {
            list.set(0, lastEle);
            downHeap(0);
        }

        return rootEle;
    }
}
