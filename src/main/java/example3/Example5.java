package example3;

public class Example5 {

    public static void main(String[] args) {
        Foo<Integer> f1 = new Foo<>();// from java 7 diamond operator
        Foo<String> f2 = new Foo<>();


        Foo<Number> f3 = new Foo<>(){// from java 9
          // class that extend A
        };
    }
}
