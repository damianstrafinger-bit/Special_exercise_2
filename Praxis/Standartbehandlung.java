package Praxis;

public class Standartbehandlung extends Behandlung{
    
    public Standartbehandlung(){
        super();
    }
    public Standartbehandlung(String kvNummer, String beschreibung, double kostensatz){
        super(kvNummer, beschreibung, kostensatz);
         
    }
    public double getKosten(){
        return getKostensatz();
    }
}
