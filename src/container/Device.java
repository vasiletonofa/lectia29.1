package container;

public class Device {

    static String companie = "Apple";

    private String denumire;

    public void setCompanie(String companie) {
        Device.companie = companie;
    }

    public String getCompanie() {
        return companie;
    }

    public String getDenumire() {
        return denumire;
    }

    public <T> void setDenumire(T denumire) {

    }

    public static <X> void afisare(X x) {
        System.out.println("Afisare..");
    }
}
