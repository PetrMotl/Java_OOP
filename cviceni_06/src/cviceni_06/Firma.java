
package cviceni_06;

/**
 *
 * @author ZADEJTE_SVE_JMENO
 */
public class Firma {
    public String jmenoFirmy;
    public int pocetZamestnancu = 0;
    public static String[] pozice = {"ředitel", "vedoucí oddělení", "programátor"};
    
//
// pro ASCII art text loga použijte: 
// https://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20
//
    
    public Firma(String argJmenoFirmy){
        this.jmenoFirmy = argJmenoFirmy;
    }
    
    public void pridatZamestnance() {
        this.pocetZamestnancu++;
    }
    
    public void vypisPocetZamestnancu(boolean argCislo){
        if(argCislo == true){
        //ve výpisu bude puze číslo
            System.out.println(this.pocetZamestnancu);
        }
        
        else{
        //výpis bude s doprovodným textem
            System.out.println("Počet zaměstnanců firmy " + this.jmenoFirmy + "je " + this.pocetZamestnancu);
        }
    }
    
    public void vypisLogo(){

        System.out.println(".------..------..------.");
        System.out.println("|A.--. ||B.--. ||C.--. |");
        System.out.println("| (\\/) || :(): || :/\\: |");
        System.out.println("| :\\/: || ()() || :\\/: |");
        System.out.println("| '--'A|| '--'B|| '--'C|");
        System.out.println("`------'`------'`------'");


    }
    
    
    
    
}
