package example2;

public class Example {
    public static void main(String[] args) {

        //only in source code in byte code there will be
        Foo<Integer> f1 = new Foo<>();
        f1.x = 5;
        Foo<String> f2 = new Foo<>();
        f2.x ="SSSS";


        int x = f2.x;// exception in compile time now



    }
}
