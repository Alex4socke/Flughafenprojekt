package classes.flughafen.bahn;

public class Bahn {
    private static int anzahlBahnen;
    private int nummer;

    public Bahn() {
        anzahlBahnen++;
        nummer = anzahlBahnen;
    }

    @Override
    public String toString() {
        return "Bahn Nummer " + nummer + " von " + anzahlBahnen;
    }
}
