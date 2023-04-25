
package cviceni_06;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author ZADEJTE_SVE_JMENO
 */
public class Main {

    public static void main(String[] args) {
        
        Firma f1 = new Firma("Firma ABC, a.s.");
        System.out.println("Název firmy je " + f1.jmenoFirmy); 
        System.out.println("a počet zaměstnanců je " + f1.pocetZamestnancu);
        
        // přidání dalšího zaměstnance
        f1.pridatZamestnance();
        System.out.println("Nyní je počet zaměstnanců " + f1.pocetZamestnancu);
        
        f1.pridatZamestnance();
        
        f1.vypisPocetZamestnancu(true);
        f1.vypisPocetZamestnancu(false);
        
        f1.vypisLogo();
        
        //vytvoření nového zaměstnance
        
        Zamestnanec z1 = new Zamestnanec("Jan", "Novák", new Date(2022,10,2),"tester");
        System.out.println("Narodil se dne " + z1.datumNarozeni);
        System.out.println("");
       //Zamestnanec z2 = new Zamestnanec();
       
       
       char volba;
       Scanner sc = new Scanner(System.in);
       
       do{
            System.out.println("Vyberte z/p/k");
            System.out.println("");
            volba = sc.nextLine().charAt(0);
            System.out.println("Volba: " + volba);
       switch(volba){
           case 'z':
           case 'Z':
               System.out.println("Nový zaměstnanec ");
               new Zamestnanec();
               sc.nextLine(); //vyčištění bufferu
           break;
           
           case 'p':
           case 'P':
               f1.vypisPocetZamestnancu(false);
               
           break;
           
           case 'k':
           case 'K':
               System.out.println("Program se ukončuje...");
           break;
        }
      
       
       
      }while(volba!='K'&& volba!='k');
        
    }
    
    
    
    
    
    
}
