package test;

import classes.flugzeug.Flugzeug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Client {
    public static int abfrageInt (String frage) {
        try
        {
            int zahl = Integer.parseInt (abfrageString (frage));
            if (zahl < 0)
                throw new NumberFormatException ("");
            return zahl;
        } catch (NumberFormatException e) {
            System.out.println ("Bitte eine gültige Zahl eingeben");
            return abfrageInt (frage);
        }
    }
    public static int abfrageInt (String frage, int min, int max) {
        int zahl = abfrageInt (frage);
        if (zahl < min || zahl > max) {
            System.out.println ("Bitte eine Zahl im Bereich von " + min +
                    " und " + max + " eingeben.");
            zahl = abfrageInt (frage, min, max);
        }
        return zahl;
    }

    public static String abfrageString (String frage) {
        try {
            System.out.println (frage + " ");
            return (new java.util.Scanner (System.in)).next();
        } catch (Exception e)
        {
            return "";
        }
    }

    public static java.util.Calendar abfrageUhrzeit (String frage){
        java.text.SimpleDateFormat formatter;
        formatter = new java.text.SimpleDateFormat ("HH:mm");
        try {
            java.util.Date date;
            date = formatter.parse (abfrageString (frage + " (HH:mm):"));
            java.util.Calendar calendar = new java.util.GregorianCalendar();
            calendar.setTime (date);
            return calendar;
        } catch (java.text.ParseException e) {
            System.out.println ("Bitte eine gültige Uhrzeit eingeben!");
            return abfrageUhrzeit (frage);
        }
    }
}
