package ohtu.kivipaperisakset;

public class KPSTekoaly extends KPSPeli {

    private Tekoaly tekoaly;

    public KPSTekoaly() {
        this.tekoaly = new Tekoaly();
    }

    @Override
    protected void tokanSiirto() {
        this.tokanSiirto = this.tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + this.tokanSiirto);
        this.tekoaly.asetaSiirto(this.ekanSiirto);
    }
}