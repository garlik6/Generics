package example3;

public class Example4 {
    public static void main(String[] args) {
        Foo<Integer> f1 = new Foo<>();

        f1.x = 10;
        f1.x = 30;

        Foo<? extends Number> f2 = new Foo<>();
        f2.x = 20;// you can't change it!(or with <?>)

        Foo<? super Number> f3 = new Foo<>();
        f3.x = 10;
    }

}
