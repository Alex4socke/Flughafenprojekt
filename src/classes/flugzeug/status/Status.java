package classes.flugzeug.status;

public class Status {
    private String name;
    public static Status wartend = new Status("wartend");
    public static Status landeanflug = new Status("landeanflug");
    public static Status gelandet = new Status("gelandet");
    public static Status geparkt = new Status("geparkt");
    public static Status startvoerbereitungen = new Status("startvorbereitungen");
    public static Status gestartet = new Status("gestartet");

    private Status(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
