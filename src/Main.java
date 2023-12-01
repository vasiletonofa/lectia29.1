import area.Circle;
import area.Figure;
import area.Paint;
import area.Square;
import container.Automobil;
import container.Container;
import container.Device;
import container.Furniture;
import inheritance.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Container<Automobil> container = new Container<>();
//        container.transport(new Automobil());
//        Automobil automobil = container.unload();
//
//
//        Container<Furniture> container1 = new Container<>();
//        container1.transport(new Furniture());
//        Furniture furniture = container1.unload();
//
//        Container<Device> container2 = new Container<>();
//        container2.transport(new Device());
//        Device device = container2.unload();
//
//        Container<Circle> container3 = new Container<>();
//        container3.transport(new Circle());
//        Circle cerc = container3.unload();
//
//
//        Paint paint = new Paint();
//        paint.draw(new Circle());
//        Circle circle =  (Circle) paint.getFigure();
//
//
//        Paint paint2 = new Paint();
//        paint2.draw(new Square());
//        Square square =  (Square) paint.getFigure();
//
//
////        Paint paint3 = new Paint();
////        paint3.draw(new Automobil());
////        Square square =  (Square) paint.getFigure();
////
////
//
//        List<Square> list = new ArrayList<>();
//        List<Automobil> list2 = new ArrayList<>();
//
//
//        Printable<Automobil> printable = new Print<>();
//        printable.print(new Automobil());
//
//        Printable<Circle> printable2 = new Print<>();
//        printable2.print(new Circle());
//
//
//        ContBancar<String, Integer> contBancar = new ContBancar<>();
//        contBancar.createAccount("Ion", 1234234234);
//
//
//        ContBancar<Persoana, Cont> account = new ContBancar<>();
//        account.createAccount(new Persoana(), new Cont());

        Device device = new Device();
        device.setDenumire("Telefon 1");
        device.setCompanie("Apple");

        Device device2 = new Device();
        device2.setDenumire("Tableta 1");
        device2.setCompanie("Apple");

        Device device3 = new Device();
        device3.setDenumire("Ceas 1");
        device3.setCompanie("Samsung");

        System.out.println(device.getCompanie()); // "Samsung"
        System.out.println(device2.getCompanie()); // "Samsung"
        System.out.println(device3.getCompanie()); //  "Samsung"

        System.out.println(device.getDenumire());
        System.out.println(device2.getDenumire());
        System.out.println(device3.getDenumire());

//        Device.afisare();
//
//        Device.setDenumire();
//
//        device3.setDenumire();
        device3.afisare(new Circle());


        GenericService genericService = new GenericService();
        genericService.print(new ArrayList<Automobil>());

        Bibilioteca<Carte> carteBibilioteca = new Bibilioteca<>();
        carteBibilioteca.addItem(new Carte());

        Bibilioteca<Ziar> bibilioteca2 = new Bibilioteca<>();
        bibilioteca2.addItem(new Ziar());

        Bibilioteca<Automobil> bibilioteca2 = new Bibilioteca<>();
        bibilioteca2.addItem(new Ziar());

        Bibilioteca bibilioteca = new Bibilioteca();
        bibilioteca.addItem(new Carte());
        bibilioteca.addItem(new Ziar());

    }
}