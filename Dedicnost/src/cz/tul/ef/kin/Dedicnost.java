
package cz.tul.ef.kin;


public class Dedicnost {

   
    public static void main(String[] args) {

        OsobniAutomobil skoda = new OsobniAutomobil();
        skoda.nastartuj(); // public
        skoda.zastav();    // public
        skoda.kupredu();   // protected
        //skoda.natankuj();  // private -- NELZE DĚDIT

        Vozidlo ford = new OsobniAutomobil();
        //OsobniAutomobil opel = new Vozidlo();   // NELZE

        Vozidlo opel = new Vozidlo();
        opel.nastartuj();

        skoda.rozjedSe();

        //String test = "TEST";
        //boolean vysledek = opel instanceof OsobniAutomobil;
        if (opel instanceof OsobniAutomobil) { // testujeme, zda objekt patří do hierarchie tříd Vozidlo > Osobní automobil
            System.out.println("ANO, objekt je instanci třídy Vozidlo");
        } else {
            System.out.println("NE, neni instanci");
        }
        
        Pokrocily uzivatel1 = new Pokrocily();
        uzivatel1.login();

    }
    
}
