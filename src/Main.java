public class Main {
    public static void main(String[] args) {

        CarShop carShop = new CarShop();

        Car car1 = new Car();
        car1.setCzyAutomat(false);
        car1.setIloscMiejsc(4);
        car1.setTyp(CarType.CABRIO);
        car1.setMocSilnika(140);
        car1.setNazwa("Ceed");
        car1.setNapedPrzod(true);
        car1.setMarka(CarBrand.KIA);
        car1.setSpalanie(7.5);
        car1.setWielkoscSilnika(1.6);
        Car car2 = new Car();
        car2.setCzyAutomat(true);
        car2.setIloscMiejsc(5);
        car2.setTyp(CarType.SEDAN);
        car2.setMocSilnika(200);
        car2.setNazwa("Octavia");
        car2.setNapedPrzod(false);
        car2.setMarka(CarBrand.SKODA);
        car2.setSpalanie(10.2);
        car2.setWielkoscSilnika(2.0);




        OfertaSamochodowa oferta1 = new OfertaSamochodowa();
        oferta1.setCar(car1);
        oferta1.setCenaNajmu(1300);
        oferta1.setCenaZakupu(30000);
        OfertaSamochodowa oferta2 = new OfertaSamochodowa();
        oferta2.setCar(car2);
        oferta2.setCenaNajmu(2000);
        oferta2.setCenaZakupu(70000);

        carShop.dodajDoListyOfert(oferta1,oferta2); //metoda dodajaca Oferty do listy
        carShop.pobierzSamochody(car1);


    }




}


