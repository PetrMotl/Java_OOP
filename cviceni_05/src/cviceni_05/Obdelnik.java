package cviceni_05;

/**
 *
 * @author ZADEJTE_SVE_JMENO
 */
public class Obdelnik {
   
    public int sirka;
    public int vyska;
    
    //obdelnik o1 = new Obdelnik(5,10);
    //obdelnik o2 = new obdelnik();
    
    public Obdelnik(int argSirka, int argVyska){
   
        this.sirka = argSirka;
    this.vyska = argVyska;
    }
    
    //Konstruktor bez parametru
    public Obdelnik(){
        
        this.sirka = 3;
        this.vyska = 2;
    }
    
    public void vypisInfo(){
        System.out.println("Obdelník má rozměry: " + this.sirka + "*" + this.vyska);
    }
}
