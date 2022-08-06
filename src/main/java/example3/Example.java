package example3;

public class Example {
    public static void main(String[] args) {
        Foo<Integer> f1;
        Foo<?> f2; // any object wildcard
        Foo<? extends Number> f3;
        Foo<? super Number> f4;
        Foo<Number> f5;
        f1 = new Foo<Double>(); //does not work
        f5 = new Foo<Integer>(); //polymorphism does not work too, use 3rd option
        // always use  the most powerful constraint

        f3 = new Foo<Number>();
        f3 = new Foo<Double>();

        f4 = new Foo<Number>();
        f4 = new Foo<Object>();
        f4 = new Foo<Integer>();

        // Foo<Object> vs Foo <?> is there any difference ? (yes we can only put Object and only Object in first one)

    }
}
