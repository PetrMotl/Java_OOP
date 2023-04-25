package cviceni_07;

/**
 *
 * @author ZADEJTE_SVE_JMENO
 */
public class Cviceni_07 {

    public static void main(String[] args) {
        // TODO code application logic here
        Prodejce p1 = new Prodejce(500, 10);
        p1.vypisInfoProdejce();
        p1.vypisPocetProdejcu();
        
        System.out.println("");
        
        //instance třídy zákazník
        Zakaznik z1 = new Zakaznik(5000, 3);
        z1.vypisInfoZakaznik();
        
        //nakup zbozi
        z1.kupZbozi(p1, 5);
        System.out.println("");
        p1.vypisInfoProdejce();
        
        System.out.println("");
        
        p1.setKsZbozi(15);
        p1.vypisInfoProdejce();
        
        p1 = null;
        System.gc();
        
        Prodejce.vypisPocetProdejcu();
    }
}
