package CollectionsandDSA.gcr_codebase.Heaps;

public class HeapBuilder {
    public void buildHeap(int[] priorities) {
        if (priorities == null) {
            throw new IllegalArgumentException("Priorities cannot be null");
        }

        int n = priorities.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(priorities, i, n);
        }
    }

    public void siftDown(int[] arr, int i, int size) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < size && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            int tmp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = tmp;
            siftDown(arr, smallest, size);
        }
    }
}