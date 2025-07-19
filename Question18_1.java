public class Question18_1 {
     private int length;
    private int breadth;

    // Default constructor
    public Question18_1() {
        this.length = 0;
        this.breadth = 0;
    }

    // Parameterized constructor
    public Question18_1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public int area() {
        return length * breadth;
    }

    
}
