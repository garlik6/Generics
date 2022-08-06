package example1;

public class Example {
    public static void main(String[] args) {

        // will still compile with generics(because generics are backwards compatible)
        Foo f1 = new Foo();
        f1.x = 5;
        Foo f2 = new Foo();
        f2.x ="SSSS";

        //// ----- we forget the type and try to cast

        int x = (int) f2.x;// class cast exception

        // generics move that problem from run time to compile time

    }
}
