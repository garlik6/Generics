package example4;

public class Example {

    public static void main(String[] args) {
        // you can't use primitives for generics
        B<?> b1 = new B<>(10);
        System.out.println(b1.x.getClass());


        B<? extends Number> b2 = new B<>(10);
        B<? super Number> b3 = new B<>(10);




    }
}
