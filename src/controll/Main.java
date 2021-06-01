package controll;

import classes.fluggesellschaft.Fluggesellschaft;
import classes.flughafen.bahn.Bahn;
import classes.flugzeug.Flugzeug;
import classes.flugzeug.typ.Flugzeugtyp;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(2);
        Calendar.getInstance().setTime(date);
        Flugzeug flugzeug = new Flugzeug(new Flugzeugtyp("boi"),
                Calendar.getInstance(), new Fluggesellschaft("lol", "lolstadt",
                "lolstrasse"));
        flugzeug.meldeGestartet(Calendar.getInstance());
        flugzeug.print();
        flugzeug.vergebeLandebahn(new Bahn());
        flugzeug.print();
    }
}

