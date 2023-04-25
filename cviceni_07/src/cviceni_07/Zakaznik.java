package cviceni_07;

/**
 *
 * @author ZADEJTE_SVE_JMENO
 */
public class Zakaznik {

    //promene tridy
    public int pocetZakazniku = 0;
    public int penize;
    public int ksZboziPotrebuje;

    //konstruktor
    public Zakaznik(int argPenize, int argKsZboziPotrebuje) {
        this.penize = argPenize;
        this.ksZboziPotrebuje = argKsZboziPotrebuje;
        pocetZakazniku++;
    }

    //metody
    public void vypisInfoZakaznik() {
        System.out.println("Zákazník má " + penize + " Kč" + " a potřebuje " + ksZboziPotrebuje + "ks zboží.");
    }

    public void kupZbozi(Prodejce objProdejce, int ks) {
        if (penize >= (ks * objProdejce.cenaZaKus)) {
            System.out.println("Zákazník kupuje" + ks + " ks zobží" + " za cenu" + objProdejce.cenaZaKus + "Kč/Ks");
            System.out.println("Zákazník zaplatil celkem " + ks * objProdejce.cenaZaKus + " Kč");
            ksZboziPotrebuje -= ks;
            objProdejce.trzba += (ks * objProdejce.cenaZaKus);
            objProdejce.ksZbozi -= ks;
        }else{
            System.out.println(" Zákazník nemá dostatek prostředků" + " k uspotečnění nákupu");
        }
    }
}
