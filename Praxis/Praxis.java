package Praxis;

import java.util.List;

public class Praxis {
    private String myName;
    // prv publ Datatype name

    private List<Patient> myPatientenliste;
    // prv publ Datatype name


    public Praxis(String myName, List<Patient> name_was_missing){
        this.myName = myName;
        this.myPatientenliste = name_was_missing;
    }
}