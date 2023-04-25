
package cz.tul.ef.kin;

public class OsobniAutomobil extends Vozidlo {
    int pocet_kol = 4;
    
    public void nastartuj(){    // překrytí metody nastartuj z třídy Vozidlo
        System.out.println("Startuji osobní automobil!");
    }
    
    public void rozjedSe(){
        super.kupredu();
    }
}
