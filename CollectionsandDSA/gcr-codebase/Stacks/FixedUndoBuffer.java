package CollectionsandDSA.gcr_codebase.Stacks;

public class FixedUndoBuffer {
    private final String[] data;
    private int top;

    public FixedUndoBuffer(int maxDepth) {
        this.data = new String[maxDepth];
        this.top = -1;
    }

    public boolean push(String edit) {
        if (top == data.length - 1) {
            return false;
        }
        data[++top] = edit;
        return true;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Nothing to undo");
        }
        return data[top--];
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Nothing to undo");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
