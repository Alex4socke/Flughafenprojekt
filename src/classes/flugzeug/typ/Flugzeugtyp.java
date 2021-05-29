package classes.flugzeug.typ;

public class Flugzeugtyp {

    private String bezeichnung;

    public Flugzeugtyp(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public String toString() {
        return "Flugzeugtyp: " + bezeichnung;
    }
}
