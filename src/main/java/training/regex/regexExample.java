package training.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExample
{
    private static String regex;
    private static String input;

    public static void main(String[] args) {

        simpleRegexMatch();
        exaclyOneWord();
        testSentenceWithoutNumbers();
        passwordTest();
        replaceWordInSentence();
        removeSpaces();

    }

    private static void removeSpaces() {
        input = "    Ala     ma  kota    .";
        regex = " +";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String newSent = matcher.replaceAll(" ");
        System.out.println(input);
        System.out.println(newSent);
        bar();
    }

    private static void replaceWordInSentence() {
        input = "Cats are very nice until don't meet other cat.";
        regex = "cat";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        String newSent = matcher.replaceAll("dog");
        System.out.println(newSent);
        bar();
    }

    private static void passwordTest() {
        input = "GGaaa12$";
        regex = "[a-zA-Z_0-9!@#]";
        System.out.println("Times: " + runTest(regex, input));
        bar();
    }

    private static void testSentenceWithoutNumbers() {
        regex = "\\d"; //to sprawdza czy to jest liczba
        input = "Ola ma trzy koty i 2 psy";
        System.out.println("Is present number? : " + (runTest(regex, input)));
        bar();
    }

    private static void exaclyOneWord() {
        regex = "\\W+Ola\\W+"; //sprawdzanie czy jedno słowo oddzielone spacjami wystepuje w zdaniu
        input = "K.ola,ma polanka a      Ola    nie";
        System.out.println("Times: " + runTest(regex, input));
        bar();
    }

    private static void simpleRegexMatch() {
        regex = "ala"; //sprawdza czy wystepuje pojedynczy ciag znakow
        input = "Ala ma kota alasika z alabamy";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Is there: " + matcher.find());
        System.out.println("times: " + runTest(regex, input));
        bar();
    }

    private static int runTest(String reg, String text)
    {
        //ile razy ten tekst wystąpi w wyrażeniu i przechowyje ilość wystąpień w zmiennej matches
        int matches = 0;
        Pattern pattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        {
            matches++;
        }

        return matches;
    }

    private static void bar(){
        System.out.println("_______________");
    }
}
