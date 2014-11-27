import java.awt.Graphics;

/**
 * Write a description of class Supermarkt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Supermarkt
{
    KundenGenerator kG;
    List kassen;
    public static int runde;

    /**
     * Constructor for objects of class Supermarkt
     */
    public Supermarkt()
    {
        kG = new KundenGenerator();
        kassen = new List();
        kassen.append(new Kasse("Kasse 1", true));
        runde = 0;
        //simulation(100);
    }

    /**
     * Die Methode steuert die Simulation durch 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void simulation(int durchgaenge)
    {
        for (int i = 0; i < durchgaenge; i++){
            naechsteRunde();
        }
    }
    
    public void naechsteRunde(){
        Queue neueKunden = kG.generiereKunden(4);
        runde++;
        //toDo: Anhängen der neu generierten Kunden an die Kassen.
        kassenArbeiten();
        //Kassen ausgeben
        kassenAusgeben(this.runde);
        //warten, falls eine automatisierte Wiederholung stattfindet.
        warte();
        
    }
    

    
    /**
     * Sucht nach der Kasse, die besetzt ist und die kürzeste Länge hat.
     */
    private Kasse getKuerzesteKasse(){
           //toDo
           return null; //damit der Funktionskopf ohne Fehler kompiliert werden kann. Muss später entfernt werden.
    }
    
    /**
     * Die Kassen bearbeiten die Artikel der vordersten Kunden.
     */
    private void kassenArbeiten(){

    }
    
    private void kassenAusgeben(int aktuelleRunde){
        System.out.print ('\f');//Konsole löschen
        System.out.println("Ihr freundlicher Supermarkt");
        System.out.println("Runde[" + aktuelleRunde + "]");
        
        kassen.toFirst();
        while(kassen.hasAccess()){
            ((Kasse)kassen.getObject()).ausgeben(aktuelleRunde);
            kassen.next();
        }
    }
    
    private void warte(){
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            
        }
    }
}
