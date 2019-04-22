package training.Files;

import java.io.*;

public class ReadAndWriteFiles {

    public static final String PATHNAME = "dane.txt";

    public static void main(String[] args) {


        try {
            FileWriter drukarz = new FileWriter(PATHNAME);
            //FileWriter drukarz = new FileWriter(PATHNAME, true); // dołączamy, bez true kasuje i pisze od nowa
            File plik = new File(PATHNAME);
            BufferedWriter writer = new BufferedWriter(drukarz);
            writer.write("pierwsza linia");
            writer.newLine();
            writer.write("druga ");
            writer.append("linia");
            writer.close();

            FileReader fileReader = new FileReader(plik);
            BufferedReader reader = new BufferedReader(fileReader);
            String linia = reader.readLine();
            while (linia != null) {
                System.out.println(linia);
                linia = reader.readLine();
            }
            System.out.println("Długość pliku w bajtach (il. znaków): "+plik.length());
            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
