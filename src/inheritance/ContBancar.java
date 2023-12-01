package inheritance;

public class ContBancar<T, E> {

    private T persoana;

    private E contul;

    public void createAccount(T pesoana, E contul) {
        System.out.println(pesoana);
        System.out.println(contul);
    }

}
