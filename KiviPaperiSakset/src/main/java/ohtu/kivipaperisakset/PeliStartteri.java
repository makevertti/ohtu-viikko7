package ohtu.kivipaperisakset;

public class PeliStartteri {

    public static boolean aloitaPeli(String pelityyppi) {
        if (pelityyppi.endsWith("a")) {
            new KPSPelaajaVsPelaaja().pelaa();
        } else if (pelityyppi.endsWith("b")) {
            new KPSTekoaly().pelaa();
        } else if (pelityyppi.endsWith("c")) {
            new KPSParempiTekoaly().pelaa();
        } else {
            return false;
        }
        return true;
    }
}
