package example3;

public class Foo<T> { // can't use with static
    T x;

    public Foo(T x) {
        this.x = x;
    }

    public Foo() {
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

}
