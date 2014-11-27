
/**
 * Write a description of class Kasse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kasse
{
    // instance variables - replace the example below with your own
    private String name;
    private boolean besetzt;
    private int laenge;
    
    private Queue schlange;

    /**
     * Constructor for objects of class Kasse
     */
    public Kasse()
    {

    }
    
    public Kasse(String name){

    }
    
    public Kasse(String name, boolean besetzt){

    }
        
    public int getLaenge(){
        return laenge;
    }
    
    public boolean istBesetzt(){
        return besetzt;
    }
    
    public void vorderstenKundenBedienen(){
        //toDo
    }
    
    public void anstellen(Kunde k){
        //toDo
    }
    
    /**
     * Die Kasse wird in einer Zeile ausgegeben. Dabei werden alle Kunden die an der Kasse 
     * warten in der Zeile ausgegeben.
     */
    public void ausgeben(int aktuelleRunde){
        System.out.print(name);
        if (!besetzt) System.out.print(" nicht besetzt");
        Queue ersatzSchlange = new Queue();
        while(!schlange.isEmpty()){
            Kunde aktuellerKunde = (Kunde) schlange.front();
            System.out.print("*");//Hier kann auch auf Daten des Kunden zurückgegriffen werden.
            ersatzSchlange.enqueue(aktuellerKunde);
            schlange.dequeue();
        }
        schlange = ersatzSchlange;
        System.out.println();//Ende der Zeile;
    }     
    
}
