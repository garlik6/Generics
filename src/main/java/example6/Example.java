package example6;

public class Example {

    public static void main(String[] args) {
        C<String> c = new C<>();// does not work(because it should extend number)
        C<Integer> c1 = new C<>();
        C<Long> c2 = new C<>();
    }
}
