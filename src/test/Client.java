package test;

import classes.Flugzeug;

public class Client {
    public static void testFlugzeugClass() {
        Flugzeug flugzeug = new Flugzeug(0, "02:03", 0);
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
}
