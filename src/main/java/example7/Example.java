package example7;

public class Example {

    public static void main(String[] args) {
        D<String, Integer> d1 = new D<>();
        D<?, Integer> d2 = new D<String, Integer>();

        // you can have any type of constraints
    }
}
