package classes.fluggesellschaft;

public class Fluggesellschaft {

    private String name;
    private String ort;
    private String strasse;

    public Fluggesellschaft(String name, String ort, String strasse) {
        this.name = name;
        this.ort = ort;
        this.strasse = strasse;
    }

    public String getName() {
        return name;
    }

    public String getOrt() {
        return ort;
    }

    public String getStrasse() {
        return strasse;
    }

    @Override
    public String toString() {
        return "Fluggesellschaft: \n Name: " + name + "\n Ort: " + ort + "\n Strasse: " + strasse;
    }
}
