package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPSPeli {

    private Tuomari tuomari;
    protected Scanner scanner;
    protected String ekanSiirto, tokanSiirto;

    public void pelaa() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");

        this.scanner = new Scanner(System.in);
        this.tuomari = new Tuomari();
        ekanSiirto();
        tokanSiirto();

        while (onkoOkSiirto(this.ekanSiirto) && onkoOkSiirto(this.tokanSiirto)) {
            tuomaroi();
            ekanSiirto();
            tokanSiirto();
        }
        lopeta();
    }

    private void lopeta() {
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(this.tuomari);
    }

    private void tuomaroi() {
        this.tuomari.kirjaaSiirto(this.ekanSiirto, this.tokanSiirto);
        System.out.println(this.tuomari);
        System.out.println();
    }

    private void ekanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        this.ekanSiirto = scanner.nextLine();
    }

    private boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    protected abstract void tokanSiirto();
}
