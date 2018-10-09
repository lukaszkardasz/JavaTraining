package training.core.inOut.serialization;

import java.io.*;

public class MenagerSerialization {
    //dodajemy ścieżkę do pliku do któego chcemy zrzucić dane
    final static String FILE_BIN =
            "./src/training/core/inOut/serialization/user.bin";
            //

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //tworzymy uzytkownika
        User user0 = new User("admin", "admin1");
        System.out.println(user0.getLogin());
        System.out.println(user0.getPassword());


        //TRY - java zamknie go za mnie
        try (FileOutputStream fos = new FileOutputStream(FILE_BIN))
        {
            //a to trzeba zamknąć samemu ręcznie
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user0);
            oos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        User user1 = null;
        FileInputStream fis = new FileInputStream(FILE_BIN);
        ObjectInputStream ois = new ObjectInputStream(fis);
        user1 = (User) ois.readObject();
        System.out.println(user1.getLogin());
        System.out.println(user1.getPassword());


    }
}