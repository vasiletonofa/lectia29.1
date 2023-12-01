package inheritance;

public class Print<T> implements Printable<T> {

    @Override
    public void print(T t) {
        System.out.println(t);
    }
}
