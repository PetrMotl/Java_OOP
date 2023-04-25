
package cviceni_03;

import java.util.Scanner;

/**
 *
 * @author PETR_MOTL
 */
public class Cviceni_03 {

   static Scanner sc = new Scanner(System.in); 
    
    
    public static void main(String[] args) {
        char volba;
        do{
        System.out.println("=========================================");
        System.out.println("|               M E N U                 |");
        System.out.println("| KIN/OP                       (c) 2022 |");
        System.out.println("=========================================");
        
        System.out.println("\nMáte na výběr: ");
        System.out.println("(c/C) číslo \n(r/R) řetězec \n");
        
        System.out.println("Zadejte volbu: ");
        volba = sc.nextLine().charAt(0);
        System.out.println("Zadali jste: \"" + volba + "\"");
        
        switch(volba){
            case 'K':
            case 'k': 
                System.out.println("Program bude ukončen...");
                break;            
            case 'C':
            case 'c': 
                System.out.println("Budeme zadávat číslo");
                cisla();
                break;            
            case 'R':
            case 'r':
                System.out.println("Budeme zadávat řetězec");
                retezce();
                break;            
            case 'A':
            case 'a':
                System.out.println("Něco se stane...");
                break;                       
            default:
                System.out.println("Neznámá voba!");
                break;
           
        }
        
        
        }while(volba != 'k' && volba != 'K'); //opakování programu pomocí do-while
        
    } //konec main
        
    public static void cisla(){
        int cislo;
        System.out.println("Zadejte int: ");
        cislo = sc.nextInt();
        System.out.println("Zadali jste tuto hodnotu: \"" + cislo + "\"");
        sc.nextLine(); // vyčištění bufferu
    }
    
    public static void retezce(){
        String retezec;
        System.out.println("Zadejte řetězec: ");
        retezec = sc.nextLine();
        System.out.println("Zadali jste následující řetězec: \"" + retezec + "\"");
        //sc.nextLine(); // vyčištění bufferu
    }
    
 
}
