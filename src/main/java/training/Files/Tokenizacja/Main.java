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
        towar[2] = new Towar(39.00, "Gruszki", 2019, 11, 28);


        try {
            /*
           DataOutputStream outS = new DataOutputStream(new FileOutputStream("nowy.txt"));

           outS.writeDouble(12412.123);

           outS.close();

           DataInputStream inS = new DataInputStream(new FileInputStream("nowy.txt"));

           System.out.println(inS.readDouble());

           inS.close();
             */
            RandomAccessFile RAF = new RandomAccessFile("nowy.txt", "rw");

            RAF.writeDouble(123.42);
            RAF.writeDouble(41.23);
            RAF.writeChars("Aalal  ");

            System.out.println(RAF.getFilePointer());

            RAF.seek(16);


            System.out.println(RAF.readChar());

            System.out.println(Double.SIZE / 8 + Integer.SIZE / 8);

            RAF.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
