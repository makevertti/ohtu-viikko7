package ohtu.kivipaperisakset;


public class KPSPelaajaVsPelaaja extends KPSPeli {

    @Override
    protected void tokanSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        this.tokanSiirto = this.scanner.nextLine();
    }
}