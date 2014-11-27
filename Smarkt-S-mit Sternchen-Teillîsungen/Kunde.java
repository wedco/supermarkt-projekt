
/**
 * Write a description of class Kunde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kunde
{
    // instance variables - replace the example below with your own
    private int artikelAnzahl;
    private int wartezeitStart;

    /**
     * Constructor for objects of class Kunde
     */
    public Kunde(int artikelAnzahl)
    {
        this.artikelAnzahl = artikelAnzahl;
        wartezeitStart=0;
    }

    
    /**
     * Dem Kunden werden pro Runde Artikel artikelProRunde Artikel bearbeitet.
     */
    public void bearbeiteArtikel(int artikelProRunde){
        artikelAnzahl = artikelAnzahl - artikelProRunde;
    }
    
    public void wartezeitStart(int aktuelleRunde){
        this.wartezeitStart = aktuelleRunde; 
    }
    
    public int getWartezeit(int aktuelleRunde){
        return aktuelleRunde - wartezeitStart;
    }
    
    public void ausgeben(int aktuelleRunde){
        System.out.print( "-[W:"+getWartezeit(aktuelleRunde)+"|A:"+artikelAnzahl+"]-");
    }
    
    public boolean istFertig(){
        return artikelAnzahl <= 0;
    }
    
}
