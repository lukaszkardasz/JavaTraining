package training.Files.Tokenizacja;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static final String FILE_NAME = "plik.txt";

    public static void main(String[] args) {

    Towar[] towar = new Towar[3];

    towar[0] = new Towar();
    towar[1] = new Towar(29.00, "Pieluchy");
    towar[2] = new Towar(39.00, "Gruszki", 2019,11,28);



        try {
            PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));
            Towar.SaveToFile(towar, writer);
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            Towar[] towarZpliku = Towar.writeFromFile(reader);

            for (int i = 0; i < towarZpliku.length ; i++){

                System.out.println(towarZpliku[i]);
            }

            reader.close();


            } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
