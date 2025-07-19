public class Question18_2 {
        private int length;
    private int breadth;

    // Default constructor (no arguments)
    public Question18_2() {
        this.length = 0;
        this.breadth = 0;
    }

    // Parameterized constructor with two arguments
    public Question18_2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Parameterized constructor with one argument (square)
    public Question18_2(int side) {
        this.length = side;
        this.breadth = side;
    }

    public int area() {
        return length * breadth;
    }
    
}
