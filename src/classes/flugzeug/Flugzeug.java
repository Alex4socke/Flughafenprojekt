package classes.flugzeug;

import classes.fluggesellschaft.Fluggesellschaft;
import classes.flughafen.bahn.Bahn;
import classes.flughafen.parkstelle.Parkstelle;
import classes.flugzeug.status.Status;
import classes.flugzeug.typ.Flugzeugtyp;

import java.util.Calendar;
import java.util.NoSuchElementException;

public class Flugzeug {
    // flugzeuggesellschaft 0 = Microair,
    private Fluggesellschaft fluggesellschaft;
    private int flugnummer;
    private Flugzeugtyp flugzeugtyp;
    private Calendar istZeitLandung;
    private Calendar istZeitStart;
    private Calendar sollZeitLandung;
    private Calendar sollZeitStart;
    private Bahn landebahn;
    private Bahn startbahn;
    private Parkstelle parkstelle;
    private Status status;
    private static int anzahlFlugzeuge;

    public Flugzeug(Flugzeugtyp flugzeugtyp, Calendar sollZeitLandung, Fluggesellschaft fluggesellschaft) {
        anzahlFlugzeuge+=1;
        flugnummer = anzahlFlugzeuge;
        this.flugzeugtyp = flugzeugtyp;
        this.sollZeitLandung = sollZeitLandung;
        this.fluggesellschaft = fluggesellschaft;
        this.status = Status.wartend;
    }

    public void vergebeLandebahn(Bahn landebahn) {
        this.landebahn = landebahn;
        status = Status.landeanflug;
    }

    public void vergebeParkstelle(Parkstelle parkstelle) {
        this.parkstelle = parkstelle;
        status = Status.geparkt;
    }

    public void vergebeStartbahn(Bahn startbahn) {
        this.startbahn = startbahn;
        status = Status.startvoerbereitungen;
    }

    public void meldeGelandet(Calendar istZeitLandung) {
        this.istZeitLandung = istZeitLandung;
        status = Status.gelandet;
    }

    public void meldeGestartet(Calendar istZeitStart) {
        this.istZeitStart = istZeitStart;
        status = Status.gestartet;
    }

    public void print() {
        System.out.println("Flugzeug Nr. " + flugnummer + " befindet sich im Status '" + status.toString() +
                "'. \n Es ist vom Typ " + flugzeugtyp.toString() + " und gehört der Fluggeselchaft " +
                fluggesellschaft.toString() + "\n Es wird verwendet/wurde verwendet:");
        System.out.println();
    }
}

