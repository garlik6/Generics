package example2;

public class Foo<T> {// can't use with static
    T x;

    public Foo(T x) {
        this.x = x;
    }


    public Foo() {
    }
}
