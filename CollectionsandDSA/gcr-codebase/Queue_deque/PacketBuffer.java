package CollectionsandDSA.gcr_codebase.Queue_deque;

public class PacketBuffer {
    private final int[] data;
    private int front;
    private int count;

    public PacketBuffer(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.data = new int[capacity];
        this.front = 0;
        this.count = 0;
    }

    public boolean enqueue(int packetId) {
        if (count == data.length) {
            return false;
        }
        data[(front + count) % data.length] = packetId;
        count++;
        return true;
    }

    public int dequeue() {
        if (count == 0) {
            throw new RuntimeException("Buffer empty");
        }

        int value = data[front];
        front = (front + 1) % data.length;
        count--;
        return value;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == data.length;
    }

    public int size() {
        return count;
    }
}