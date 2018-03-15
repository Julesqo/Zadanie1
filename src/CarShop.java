import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CarShop {

    public String nazwa;
    public List<OfertaSamochodowa> listaOfert = new ArrayList<OfertaSamochodowa>();


    public List<OfertaSamochodowa> getListaOfert() {
        return listaOfert;
    }

    public void dodajDoListyOfert(OfertaSamochodowa... a) {
        OfertaSamochodowa ofertaSamochodowa = new OfertaSamochodowa();
        for (OfertaSamochodowa i : a) {

            listaOfert.add(i);
        }
        System.out.println(listaOfert.size());

    }


    public void pobierzSamochody(Car car) {


    }

}



