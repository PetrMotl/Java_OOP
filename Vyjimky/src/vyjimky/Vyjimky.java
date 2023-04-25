package vyjimky;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vyjimky {

    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int cislo;
//           
//        //zachyceni špatného vstupu z klávesnice
//        try {
//            
//            System.out.println("Zadejte číslo: ");
//            cislo = sc.nextInt();
//            System.out.println("Zadali jste: " + cislo);
//        }
//        catch(InputMismatchException e){
//            System.out.println("Bylo zadané špatné číslo. ");
//            System.out.println(e.getMessage());
//            sc.nextLine();
//            System.out.println("Zadejte číselnou hodnotu:");
//            cislo = sc.nextInt();
//        }

        //čtení dat souboru
        final int MAX_POCET_RADKU = 3;
        final int MAX_POCET_ATRIBUTU = 6;

        //Připojení externího souboru,. databáze
        try {
            File databaze = new File("database.csv");
            BufferedReader bfr = new BufferedReader(new FileReader(databaze));
            String[] poleRadku = new String[MAX_POCET_RADKU];
            String radek;
            int counter = 0;
            while ((radek = bfr.readLine()) != null) {
                poleRadku[counter] = radek;
                System.out.println(poleRadku[counter]);
                counter++;
            }
            bfr.close();

            String[] rozdelenyRadek = new String[MAX_POCET_ATRIBUTU];
            String[][] db = new String[MAX_POCET_RADKU][MAX_POCET_ATRIBUTU];
            int j = 0;
            System.out.println("ICO | Jmeno | Prijmeni | Firma | Adresa | PSC");
            System.out.println("---------------------------------------------");
            for (int i = 0; i < poleRadku.length; i++) {
                rozdelenyRadek = poleRadku[i].split(";"); //přepsání databáze se oddělují jednotlivé položky středníkem, takže aby je to rozdělilo
                db[j] = rozdelenyRadek;
                System.out.println(rozdelenyRadek[0] + " | " + rozdelenyRadek[1] + " | " + rozdelenyRadek[2] + " | " + rozdelenyRadek[3] + " | " + rozdelenyRadek[4] + " | " + rozdelenyRadek[5] + " | ");
                j++;
            }

            //vystup do html souboru, výběr zákazníka
            Scanner sc = new Scanner(System.in);
            System.out.println("Zadejte číslo zákazníka: ");
            int volba = sc.nextInt();
            System.out.println("Budou vypsány údaje o zákazníku: " + db[volba][3]);

            FileOutputStream fos = new FileOutputStream("vystup.html");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bfw = new BufferedWriter(osw);
            StringBuilder sb = new StringBuilder();
            sb.append("<html>");
            sb.append("<head>");
            sb.append("<title>Info o zákazníkovi</title>");
            sb.append("<body>");
            sb.append("<p>");
            sb.append("Zákazníky: " + db[volba][1]+ " " + db[volba][2]);
            sb.append("<br> má IČO <strong>" + db[volba][0]+ " </strong>");
            sb.append("<br> a sídlí: " + db[volba][4]);
            sb.append("</p>");
            sb.append("</body>");
            sb.append("</head>");
            sb.append("</html>");
            
            //Vystup do souboru
            bfw.write(sb.toString());
            bfw.close();
            //zarovnání alt shift f
            
            //Automatické otevření souboru
            File f = new File("vystup.html");
            Desktop.getDesktop().browse(f.toURI());
        
        } catch (FileNotFoundException e) {
            System.out.println("Soubor nebyl nalezen, zkontrolujte cestu!");
        } catch (IOException ex) {
            Logger.getLogger(Vyjimky.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
