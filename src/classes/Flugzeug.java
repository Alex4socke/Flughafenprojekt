package classes;

import java.util.NoSuchElementException;

public class Flugzeug {
    // flugzeuggesellschaft 0 = Microair,
    private int fluggesellschaft;
    private String[] flugzeuggesellschaften = {"Microair"};
    private int flugnummer;
    private int flugzeugtyp;
    private String[] flugzeugtypen = {"Bowling"};
    private String istZeitLandung;
    private String istZeitStart;
    private String sollZeitLandung;
    private String sollZeitStart;
    private int landebahn;
    private int startbahn;
    private int parkstelle;
    //status 0 = wartend, 1 = geparkt, 2 = startvorbereitung, 3 = gestartet, 4 = landeanflug, 5 = gelandet
    private String[] stati = {"wartend", "geparkt", "startvorbereitung", "gestartet", "landeanflug", "gelandet"};
    private int status;
    private int anzahlFlugzeuge;

    public Flugzeug(int flugzeugtyp, String sollZeitLandung, int fluggesellschaft) {
        anzahlFlugzeuge+=1;
        flugnummer = anzahlFlugzeuge;
        this.flugzeugtyp = flugzeugtyp;
        this.sollZeitLandung = sollZeitLandung;
        this.fluggesellschaft = fluggesellschaft;
        this.status = 0;
    }

    public void vergebeLandebahn(int landebahn) {
        if (landebahn < 1) {
            throw new NoSuchElementException("Landebahn muss größer als 0 sein.");
        }
        this.landebahn = landebahn;
        status = 4;
    }

    public void vergebeParkstelle(int parkstelle) {
        if (parkstelle < 1) {
            throw new NoSuchElementException("Parkstelle muss größer als 0 sein.");
        }
        this.parkstelle = parkstelle;
        status = 5;
    }

    public void meldeGelandet(String istZeitLandung) {
        this.istZeitLandung = istZeitLandung;
        status = 1;
    }

    public void vergebeStartbahn(int startbahn) {
        if (startbahn < 1) {
            throw new NoSuchElementException("Startbahn muss größer als 0 sein.");
        }
        this.startbahn = startbahn;
        status = 2;
    }

    public void meldeGestartet(String istZeitStart) {
        this.istZeitStart = istZeitStart;
        status = 3;
    }

    public void print() {
        System.out.println("Flugzeug Nr. " + flugnummer + " befindet sich im Status '" + stati[status] +
                "'. \n Es ist vom Typ " + flugzeugtypen[flugzeugtyp] + " und gehört der Fluggeselchaft " +
                flugzeuggesellschaften[fluggesellschaft] + "\n Es wird verwendet/wurde verwendet:");
        if (landebahn != 0) {
            System.out.println("-Landebahn " + landebahn);
        }
        if (parkstelle != 0) {
            System.out.println("-Parkstelle " + parkstelle);
        }
        if (startbahn != 0) {
            System.out.println("-Startbahn " + startbahn);
        }
        System.out.println();
    }

}

