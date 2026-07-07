package Praxis;

public abstract class Behandlung {
    private String kvNummer;
    private String beschreibung;
    private double kostensatz;

    public Behandlung(){

    }
    public Behandlung(String kvNummer, String beschreibung, double kostensatz){
        this.kvNummer = kvNummer;
        this.beschreibung = beschreibung;
        this.kostensatz = kostensatz;
    }
    public abstract double getKosten();
    
    public String getKvNummer(){
        return this.kvNummer;
    }
    public String getBeschreibung(){
        return this.beschreibung;
    }
    public double getKostensatz(){
        return this.kostensatz;
    }
}
