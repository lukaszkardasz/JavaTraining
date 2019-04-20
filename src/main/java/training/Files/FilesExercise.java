package training.Files;

import java.io.*;
import java.util.Date;

public class FilesExercise {

    public static void main(String[] args) {
        try {
            File plik = new File("test.txt");




            System.out.println("-----------");
            System.out.println(plik.getCanonicalPath());// kanoniczna, zawsze prawdziwa
            System.out.println(plik.getAbsolutePath());// absolutna doslowna sciezka
            System.out.println("-----------");
            System.out.println("Czy mogę pisać? :"+plik.canWrite());
            System.out.println("Czy mogę odpalić? :"+plik.canExecute());
            System.out.println("Czy mogę czytać? :"+plik.canRead());
            System.out.println("Czy jest ukryty? :"+plik.isHidden());
            System.out.println("Czy jest plikiem? :"+plik.isFile());
            System.out.println("Ostatnia modyfikacja :"+new Date(plik.lastModified()));
            System.out.println("Długość pliku w bajtach (il. znaków): "+plik.length());
            System.out.println("-----------");



            if (getFileExtension(plik).equals("txt")) {

                try {
                    System.out.println("zmiana wartosci pliku");
                    Writer writer = new FileWriter("test.txt");
                    writer.write("lalalalalla");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream is;
        OutputStream os;
        Reader reader;



    }

    static String getFileExtension(File file) {
        if (file == null) {
            return "";
        }
        String name = file.getName();
        int i = name.lastIndexOf('.');
        String ext = i > 0 ? name.substring(i + 1) : "";
        return ext;
    }

}
