package retezcesoubory;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RetezceSoubory {

    public static void main(String[] args) {
        // deklarace retezcu
        String retezec = "Ahoj";
        String retezec2 = new String("Ahoj");
        char[] retezec3 = {'A', 'h', 'o', 'j'};
        String r = new String(retezec3);
        System.out.println("Retezec 3: " + r);
        
        
        //porovnani retezce
        if (retezec == r) {
            System.out.println("Řetězce se rovnají!");
        }
        else   {
            System.out.println("Řetězce se nerovnají!");
        }
    
        // --compare to
        int vysledek = retezec.compareToIgnoreCase(retezec2);
        System.out.println("Výsledek compareToIgnoreCase: " + vysledek);
        
        // --equals
        boolean vysledek2 = retezec.equals(retezec2);
        System.out.println("Výsledek equals: " + vysledek2);
    
        // Dalsi metody
        System.out.println(retezec.toUpperCase());
        System.out.println(retezec.toLowerCase());
        System.out.println("Test " + "test 2");
        System.out.println(retezec.concat("!!"));
        
        System.out.println(retezec.substring(2));
        System.out.println(retezec.substring(0, 2));
        
        String aktualni_adresar = System.getProperty("user.dir");
        System.out.println("Aktuální adresář je: " + aktualni_adresar);
        
        System.out.println("File separator: " + File.separator);
        
        String adresare[] = aktualni_adresar.split(Pattern.quote(File.separator));
        
        for (String a: adresare) {
            System.out.println(a);
        }
        
        // výpis souborů v adresáři
        System.out.println("SOUBORY V AKTUÁLNÍM ADRESÁŘI:");
        File f = new File(aktualni_adresar);
        String soubory[] = f.list();
        
        for (int i = 0; i < soubory.length; i++) {
            File f1 = new File(soubory[i]);
            long velikost = f1.length();
            //System.out.println("Soubor: " + soubory[i] + "o velikosti " + velikost);
            if (f1.isDirectory()) {
                System.out.println("[" + i + "]" + " Adresář: " + soubory[i]);
            }
            else{
                System.out.println("Soubor: " + soubory[i]);
            }     
        }
        
        //výběr adresáře k výpisu
        System.out.println("Vyberte číslo adresáře: ");
        Scanner sc = new Scanner(System.in);
        int volba = sc.nextInt();
        System.out.println("Vybrán adresář " + soubory[volba]);
        
        //výpis vybraného adresáře
        System.out.println("============");
        System.out.println("V adresáři " + soubory[volba] + "jsou následující soubory: ");
        //C:\Users\Uzivatel\Documents\NetBeansProjects\RetezceSoubory\soubory[volba]
        File f2 = new File(aktualni_adresar + File.separator + soubory[volba]);
        String soubory2[] = f2.list();
        for (int i = 0; i < soubory2.length ; i++) {
            System.out.println("[" + i + "] " + soubory2[i]);
        }
      
    }
    
}
