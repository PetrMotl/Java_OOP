package cviceni_07;

/**
 *
 * @author ZADEJTE_SVE_JMENO
 */
public class Prodejce {

    public static int pocetProdejcu;
    public int cenaZaKus;

    public int getKsZbozi() {
        return ksZbozi;
    }

    public void setKsZbozi(int ksZbozi) {
        this.ksZbozi = ksZbozi;
    }

    public int getTrzba() {
        return trzba;
    }

    public void setTrzba(int trzba) {
        this.trzba = trzba;
    }
    public int ksZbozi;
    public int trzba;

    //kontrusktor
    public Prodejce(int argCenaZaKus, int argKsZbozi) {
        this.cenaZaKus = argCenaZaKus;
        this.ksZbozi = argKsZbozi;
        pocetProdejcu++;
    }

    //metody
    public void vypisInfoProdejce() {
        System.out.println("Prodejce má k prodeji " + ksZbozi + "ks zboží" + "v celkové hodnotě " + ksZbozi * cenaZaKus);
        System.out.println("celková tržba prodejce je " + trzba);
    }

    public static void vypisPocetProdejcu() {
        System.out.println("Počet prodejců je: " + pocetProdejcu);
    }
    
    @Override
    protected void finalize() throws Throwable{
        pocetProdejcu--;
        System.out.println("Konec prodejce.");
        super.finalize();
    }
    }

