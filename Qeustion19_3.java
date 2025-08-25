import java.util.HashMap;

public class Qeustion19_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 3, 1, 3};
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : array) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } 
            else {
                freqMap.put(num, 1);
            }
        }
        for (int key : freqMap.keySet()) {
            System.out.println("Element " + key + " occurs " + freqMap.get(key) + " times.");
        }
        
    }
    
}


