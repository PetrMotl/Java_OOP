package cviceni_05;

import java.util.Arrays;

/**
 *
 * @author ZADEJTE_SVE_JMENO
 */
public class Pole {

    /**
     * Cílem dnešního cvičení je si procvičit práci s polemi a objekty.
     * Úkoly:
     *  - 
     */
    public static void main(String[] args) {
      /*  int[] pole;
        String []poleRetezcu;
        
        pole = new int[3];
        pole[0] = 1;
        pole[1] = 2;
        pole[2] = 3;
        
        int[] pole2 = {1,2,3,4,5};
        //int test = 12;
        String[] poleRetezcu2 = {"Ahoj, pacholku"};
        
        System.out.println("Pole má délku: " + poleRetezcu2.length);
        
        int index = 0;
        for(int element : pole){
            System.out.println("Pole obsahuje na indexu: " + index + " hodnotu: " + element);
            index++;
        }
        
        String retezec1 = "test";
        String retezec2 = "boban";
        String retezec3 = "spánek";
        
        String[] dalsiPoleRetezcu = {retezec1, retezec2, retezec3};
        System.out.println(dalsiPoleRetezcu[1]);
        
        for (int i = 0; i < dalsiPoleRetezcu.length; i++) {
            System.out.println("na indexu " + i + " je uložená hodnota: \"" + dalsiPoleRetezcu[i] + "\"");
        }
        
        //  Řazení pole
        
        Arrays.sort(dalsiPoleRetezcu);
        for (int i = 0; i < dalsiPoleRetezcu.length; i++) {
            System.out.println("na indexu " + i + " je uložená hodnota: \"" + dalsiPoleRetezcu[i] + "\"");
        }
        
        System.out.println("");
        Arrays.sort(pole);
        for (int j = 0; j < pole.length; j++) {
            System.out.println("na indexu " + j + " je uložená hodnota: \"" + pole[j] + "\"");
        }
        
        System.out.println("");
        
        //Test rovnosti
        
        int[] pole1a = {1,2,3};
       // int[] pole1b = {1,2,4};
        int[] pole1b ={pole2[0], pole2[1], pole2[2]};
        
        if(Arrays.equals(pole1a, pole1b)){
            System.out.println("Pole se rovnají!");
        }else{
            System.out.println("Pole se nerovnají!");
        }
        System.out.println("Arrays compare: " + Arrays.compare(pole1a, pole1b));
        
        //Výpis pole jako string
        
        System.out.println("Výpis pole: " + Arrays.toString(pole1b));
        System.out.println("Výpis pole: " + Arrays.toString(dalsiPoleRetezcu));
        */
        
      
      Obdelnik o1 = new Obdelnik(10, 5);
      o1.vypisInfo();
      
      Obdelnik o2 = new Obdelnik();
      o2.vypisInfo();
      
      o2.sirka = 20;
      o2.vypisInfo();
      
        System.out.println("Rozměry obdelníku o2 jsou:  šířka = " + o2.sirka + " výška = " + o2.vyska);
        
        
        //Pole Objektů
        Obdelnik o3 = new Obdelnik();
        Obdelnik[] poleObdelniku = {o1, o2, o3};
        System.out.println("Pole obdelníku: " + Arrays.toString(poleObdelniku));
        
        for(Obdelnik ob : poleObdelniku){
            System.out.println("Obdelnik " + ob.sirka + "*" + ob.vyska);
        }
    }
    
}
