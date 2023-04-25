
package cviceni_04;

/**
 *
 * @author ZADEJTE_SVE_JMENO
 */
public class Cviceni_04 {
    
    /*
    P L Á N  C V I Č E N Í
    - statické metody a proměnné
    - ASCII art v konzolovém výstupu
    - opakování tvorby menu
    */

    public static void main(String[] args) {
       Vypisy.vitej("test");
       
       char volba;
       
       do{
       Vypisy.zobrazMenu();
       
       volba = Vypisy.getVolba();
       
       switch(volba){
           case 'a':
           case 'A':
               System.out.println("Absolutní hodnota: " + Vypisy.getAbsHodnota());
               Vypisy.sc.nextLine(); //vyčištění bufferu
           break;
           
           case 'n':
           case 'N':
               System.out.println("Náhondé číslo: " + Math.random());
           break;
           
           case 'k':
           case 'K':
               System.out.println("Program se ukončuje...");
           break;
        }
      
       
       
      }while(volba!='K'&& volba!='k');
    
    }
    
}
