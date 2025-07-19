import java.util.ArrayList;

public class Question31_1 {
    
    public class Stack {
    private ArrayList<Integer> list = new ArrayList<>();

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return list.remove(list.size() - 1);
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
}