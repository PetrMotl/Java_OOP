/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cviceni_04;
import java.util.Scanner;
/**
 *
 * @author PETR_MOTL
 */

public class Vypisy {
   
    static Scanner sc = new Scanner(System.in);
    
    public static void vitej(String jmeno){
               
        System.out.println("    =/\\                 /\\=");        
        System.out.println("    / \\'._   (\\_/)   _.'/ \\");
        System.out.println("   / .''._'--(o.o)--'_.''. \\");
        System.out.println("  /.' _/ |`'=/ \" \\='`| \\_ `.\\");
        System.out.println(" /` .' `\\;-,'\\___/',-;/` '. '\\");
        System.out.println("/.-'       `\\(-V-)/`       `-.\\");
        System.out.println("`            \"   \"  Vítej uživateli " + jmeno + "!");
            

    }
    
    public static void zobrazMenu(){
                
        System.out.println("========================================");         
        System.out.println(".___  ___.  _______ .__   __.  __    __ ");    
        System.out.println("|   \\/   | |   ____||  \\ |  | |  |  |  | ");    
        System.out.println("|  \\  /  | |  |__   |   \\|  | |  |  |  | ");    
        System.out.println("|  |\\/|  | |   __|  |  . `  | |  |  |  | ");    
        System.out.println("|  |  |  | |  |____ |  |\\   | |  `--'  | ");    
        System.out.println("|__|  |__| |_______||__| \\__|  \\______/  ");              
        System.out.println("========================================");
        System.out.println("\nStiskni klávesu pro výběr metody");
        System.out.println("\na/A - absolutní hodnota");
        System.out.println("n/N - náhodné číslo");
        System.out.println("k/K - ukončit program");
        System.out.println("========================================"); 
    }
    
    
    public static char getVolba(){
        
        char volba;
        volba = sc.nextLine().charAt(0);
        
        return volba;
    }
    
    
    public static int getAbsHodnota(){
    
        System.out.println("Zadejte int: ");
        int cislo = sc.nextInt();
        
        int absHodnota = Math.abs(cislo);
                
        return absHodnota;
    }
    
    
}
