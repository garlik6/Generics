package example6;

public class C<N extends Number> {

    public void doSmth(N n){
        n.longValue();
    }
}
