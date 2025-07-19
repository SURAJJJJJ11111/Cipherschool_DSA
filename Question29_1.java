import java.util.ArrayList;

public class Question29_1 {
    private ArrayList<Integer> list = new ArrayList<>();

    public void enqueue(int x) {
        list.add(x);
    }

    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return list.remove(0);
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
    
}
