package training.Files.Tokenizacja;

import java.time.LocalDateTime;
import java.time.Month;

public class Towar {

    public Towar() {
        this.cena = 0.0;
        this.nazwa = "";
        this.dataWydania = LocalDateTime.now();
    }

    public Towar(double cena, String nazwa){
        this();
        this.cena=cena;
        this.nazwa=nazwa;
    }

    public Towar(double cena, String nazwa, int year, Month month, int dayOfMonth, int hour, int minute) {
        this.cena = cena;
        this.nazwa = nazwa;

    }

    double cena;
    String nazwa;
    LocalDateTime dataWydania;
}
