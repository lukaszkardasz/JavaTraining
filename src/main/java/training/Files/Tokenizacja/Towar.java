package training.Files.Tokenizacja;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Towar {

    private static final String separator = ";";
    private Date dataWydania;
    private String nazwa;
    private double cena;

    public Towar() {
        this.cena = 0.0;
        this.nazwa = " ";
        this.dataWydania = new GregorianCalendar().getTime();
    }

    public Towar(double cena, String nazwa) {
        this();
        this.cena = cena;
        this.nazwa = nazwa;
    }

    public Towar(double cena, String nazwa, int year, int month, int dayOfMonth) {
        this(cena, nazwa);
        GregorianCalendar kalendarz = new GregorianCalendar(year, month - 1, dayOfMonth);
        this.dataWydania = kalendarz.getTime();
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(Date dataWydania) {
        this.dataWydania = dataWydania;
    }

    @Override
    public String toString() {
        GregorianCalendar kalendarz = new GregorianCalendar();
        kalendarz.setTime(this.getDataWydania());
        return String.format("Towar{cena= %s zł, nazwa= '%s', dataWydania: %d.%d.%d r.}", getCena(), getNazwa(), kalendarz.get(Calendar.DAY_OF_MONTH), kalendarz.get(Calendar.MONTH)+1, kalendarz.get(Calendar.YEAR));
    }

    public static void SaveToFile(Towar[] towar, PrintWriter outS) {
        outS.println(towar.length);
        GregorianCalendar kalendarz = new GregorianCalendar();

        for (Towar t : towar) {
            kalendarz.setTime(t.getDataWydania());
            outS.println(t.getCena() +
                    separator + t.getNazwa() +
                    separator + kalendarz.get(Calendar.DAY_OF_MONTH) +
                    separator + (kalendarz.get(Calendar.MONTH)+1) +
                    separator + kalendarz.get(Calendar.YEAR));
        }

    }

    public static Towar[] writeFromFile(BufferedReader inS) throws IOException {
        int dl = Integer.parseInt(inS.readLine());
        Towar[] towar = new Towar[dl];
        for (int i = 0; i < dl; i++) {
            String linia = inS.readLine();
            StringTokenizer tokeny = new StringTokenizer(linia, separator);
            double cena = Double.parseDouble(tokeny.nextToken());
            String nazwa = tokeny.nextToken();
            int day = Integer.parseInt(tokeny.nextToken());
            int month = Integer.parseInt(tokeny.nextToken());
            int year = Integer.parseInt(tokeny.nextToken());
            towar[i] = new Towar(cena, nazwa, year, month, day);
        }

        return towar;
    }

}

