
/**
 * Write a description of class KundenGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KundenGenerator
{
    

    /**
     * Constructor for objects of class KundenGenerator
     */
    public KundenGenerator()
    {
        
    }

    public Queue generiereKunden(int maxKunden){
        Queue neueKunden = new Queue();
        int anzahlKundenProRunde = (int)(maxKunden * Math.random());
        for (int i = 0; i < anzahlKundenProRunde; i++){
            neueKunden.enqueue(new Kunde((int)(10*Math.random())));
        }
        return neueKunden;
    }
}
