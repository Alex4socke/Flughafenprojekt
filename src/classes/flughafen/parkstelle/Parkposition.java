package classes.flughafen.parkstelle;

public class Parkposition extends Parkstelle{
    private static int anzahlParkpositionen;
    private int nummer;

    public Parkposition() {
        anzahlParkpositionen++;
        nummer = anzahlParkpositionen;
    }
}
