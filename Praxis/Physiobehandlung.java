package Praxis;

public class Physiobehandlung extends Behandlung{
    
    public Physiobehandlung(){
        super();
    }
    public Physiobehandlung(String kvNummer, String beschreibung, double kostensatz){
        super(kvNummer, beschreibung, kostensatz);
    }
    public double getKosten(){
        return getKostensatz();
    }
   
}

