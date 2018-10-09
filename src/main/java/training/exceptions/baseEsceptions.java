package training.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class baseEsceptions
{
    static Logger logger = Logger.getLogger(baseEsceptions.class.getName());

    public static void main(String[] args)
    {
        NullPointerExceptionMethod();
        try
        {
            RangeExceptionMethod("word",8);
        } catch (RangeException e)
        {
            e.printStackTrace();
        }
        //szukamy bledów ze znalezieniem pliku i jego czytaniem
        //readFileWithFinallyBlock();
    }

    //private static void readFileWithFinallyBlock()
//    {
//        File file new File("Dummy.file.txt");
//        try
//        {
//            FileReader fr = new FileReader(file);
//            char[] text = new char[50];
//            fr.read(text);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//    }

    private static void RangeExceptionMethod(String word, int pos) throws RangeException {
        //sprawdzamy czy pozycja w char jest ponizej poczatku slowa lub poniżej jeżeli np sprawdzamy char na nr 8
        if (pos >=0 && pos <word.length())
        {
            System.out.println(word.charAt(pos));
        }
        else
        {
            throw new RangeException();
        }
    }

    private static void NullPointerExceptionMethod()
    {
        String nullString = null;
        try
        {
            if (nullString == null)
            {
                throw new NullPointerException("String is NULL!!!");
            }

            Integer integer = Integer.parseInt(nullString);
//niebezpieczne bo może wystąpić błąd - dlatego dajemy tu try - w tym może wystąpić błąd...
// dlatego to robimy- metoda to string jest narażona na błędy
        }
//catch segregujemy od najszczegółowszych do najbardziej ogólnych

        catch (NumberFormatException | NullPointerException wyjatek) // w jednym catchu możemy złpał więcej niż jeden bład
        {
            logger.log(Level.SEVERE, "Try to parse: " + nullString);
            logger.log(Level.SEVERE, wyjatek.toString());
        }

        catch (Exception wyjatek2)
        {
            logger.log(Level.SEVERE, "General exception");
        }
    }

}
