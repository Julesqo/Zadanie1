import java.time.LocalDate;

public class Car {
    private String nazwa;
    private double spalanie;
    private double wielkoscSilnika;
    private int iloscMiejsc;
    private int mocSilnika;
    private LocalDate dataWyprodukowania;
    private boolean czyAutomat;
    private boolean napedPrzod;
    private CarType typ;
    private CarBrand marka;


    public Car(String nazwa, double spalanie, double wielkoscSilnika, int iloscMiejsc, int mocSilnika, LocalDate dataWyprodukowania, boolean czyAutomat, boolean napedPrzod, CarType typ, CarBrand marka) {
        this.nazwa = nazwa;
        this.spalanie = spalanie;
        this.wielkoscSilnika = wielkoscSilnika;
        this.iloscMiejsc = iloscMiejsc;
        this.mocSilnika = mocSilnika;
        this.dataWyprodukowania = dataWyprodukowania;
        this.czyAutomat = czyAutomat;
        this.napedPrzod = napedPrzod;
        this.typ = typ;
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }

    public double getWielkoscSilnika() {
        return wielkoscSilnika;
    }

    public void setWielkoscSilnika(double wielkoscSilnika) {
        this.wielkoscSilnika = wielkoscSilnika;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public int getMocSilnika() {
        return mocSilnika;
    }

    public void setMocSilnika(int mocSilnika) {
        this.mocSilnika = mocSilnika;
    }

    public LocalDate getDataWyprodukowania() {
        return dataWyprodukowania;
    }

    public void setDataWyprodukowania(LocalDate dataWyprodukowania) {
        this.dataWyprodukowania = dataWyprodukowania;
    }

    public boolean isCzyAutomat() {
        return czyAutomat;
    }

    public void setCzyAutomat(boolean czyAutomat) {
        this.czyAutomat = czyAutomat;
    }

    public boolean isNapedPrzod() {
        return napedPrzod;
    }

    public void setNapedPrzod(boolean napedPrzod) {
        this.napedPrzod = napedPrzod;
    }

    public CarType getTyp() {
        return typ;
    }

    public void setTyp(CarType typ) {
        this.typ = typ;
    }

    public CarBrand getMarka() {
        return marka;
    }

    public void setMarka(CarBrand marka) {
        this.marka = marka;
    }
}
