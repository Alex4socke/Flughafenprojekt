package test;

import classes.Flugzeug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void testFlugzeugClass() throws IOException {
        int flugzeugtyp = 0;
        String sollZeitLandung = "";
        int fluggesellschaft = 0;
        try {
            flugzeugtyp = Integer.parseInt(getUserInput("flugzeugtyp"));
            sollZeitLandung = getUserInput("sollZeitLandung");
            fluggesellschaft = Integer.parseInt(getUserInput("fluggesellschaft"));
        } catch (NumberFormatException e) {
            System.out.println("Ob du dumm bist frage ich. Da steht ganz klar was du eingeben sollst...");
            testFlugzeugClass();
        }
        Flugzeug flugzeug = new Flugzeug(flugzeugtyp, sollZeitLandung, fluggesellschaft);
        flugzeug.print();
        flugzeug.vergebeLandebahn(1);
        flugzeug.print();
        flugzeug.meldeGelandet("02:04");
        flugzeug.print();
        flugzeug.vergebeParkstelle(7);
        flugzeug.print();
        flugzeug.vergebeStartbahn(2);
        flugzeug.print();
        flugzeug.meldeGestartet("10:20");
        flugzeug.print();
    }

    private static String readInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static String getUserInput(String parameter) throws IOException {
        String result = "";
        switch (parameter){
            case "flugzeugtyp":
                System.out.println("Geben sie den Flugzeugtyp an (0 = Bowling, anderes gibts noch nicht):");
                result = readInput();
                break;
            case "sollZeitLandung":
                System.out.println("Geben sie die Sollzeit der Landung ein (hh:mm):");
                result = readInput();
                break;
            case "fluggesellschaft":
                System.out.println("Geben sie die Fluggesellschaft ein (0 = Microair, andere gibts noch nicht):");
                result = readInput();
                break;
        }
        return result;
    }
}
