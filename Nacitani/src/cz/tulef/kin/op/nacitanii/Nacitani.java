package cz.tulef.kin.op.nacitanii;
import java.util.Scanner;

public class Nacitani {

    public static void main(String[] args) {
        int celeCislo = 16;
        double realneCisloNove = 16d;
        char znak = '\u00a9';
        int cislo;
        double rCislo;
        char znak2;
        String retezec;
        
//        System.out.println("Proměnná \"celeCislo\" = " + celeCislo);
//        System.out.println("\nProměnná \"realneCislo\" = " + realneCisloNove);
//        System.out.println("\nZnak \n" + znak);
        
                
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Zadejte celé číslo: ");
        cislo = sc.nextInt();
        System.out.println("Zadali jste číslo: " + cislo);
        
        System.out.println("Zadejte reálné číslo: ");
        rCislo = sc.nextDouble();
        System.out.println("Zadali jste číslo: " + rCislo);
        sc.nextLine();
        
        System.out.println("Zadejte znak: ");
        znak2 = sc.nextLine().charAt(0);
        System.out.println("Zadali jste znak: " + znak2);
        
        System.out.println("Zadejte řetězec: ");
        retezec = sc.nextLine();
        System.out.println("Zadali jste řetězec: \"" + retezec + "\"");
        
        System.out.println("\n=======================================");
        System.out.println("\n\nVýsledné hodnoty jsou: \nCelé:  \t" + cislo + "\nReálné: " + rCislo + "\nZnak: \t" + znak2 + "\nŘetězec: " + retezec);
        
    }
    
}
 
