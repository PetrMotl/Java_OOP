package cviceni_06;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ZADEJTE_SVE_JMENO
 */
public class Zamestnanec {

    public String jmeno;
    public String prijmeni;
    public Date datumNarozeni;
    public String pozice;

    public Zamestnanec(String argJmeno, String argPrijmeni, Date argNarozeni, String argPozice) {
        this.jmeno = argJmeno;
        this.prijmeni = argPrijmeni;
        this.datumNarozeni = argNarozeni;
        this.pozice = argPozice;
    }

    public Zamestnanec() {
        Scanner sc = new Scanner(System.in,"utf-8");
        System.out.println("Zadejte jméno: ");
        this.jmeno = sc.nextLine();

        System.out.println("Zadejte příjmení: ");
        this.prijmeni = sc.nextLine();

        this.datumNarozeni = new Date();

        System.out.println("Zadejte číslo pozice: ");
        for (int i = 0; i < Firma.pozice.length; i++) {
            System.out.println("Pozice č." + i + ": " + Firma.pozice[i]);
        }
        int volbaPozice;
        volbaPozice = sc.nextInt();
        this.pozice = Firma.pozice[volbaPozice];
        sc.close();

        System.out.println("Byl vytvořen zaměstnanec jménem " + this.jmeno + " " + this.prijmeni + " na pozici " + this.pozice);

    }

}
