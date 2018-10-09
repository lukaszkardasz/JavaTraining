package training.java8;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class optionalTest {

    //robimy testy jUnitowe - sprawdzamy czy ta obiekt puszka - Optional jest pusty czy pełny czy cośtam jest
    //aby w ogóle robić testy jUnit trzeba mieć zaimportowąną bibliotekę jUnit czyli plik POM.xml poniżej:
/*    <dependency>
           <groupId>junit</groupId>
           <artifactId>junit</artifactId>
           <version>4.12</version>
           <scope>compile</scope>
       </dependency>
       + oczywiście biblioteka jUnit*/

    @Test
    public void emptyOptionalisOk(){
        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void stringOptionalIsOk(){
        //wrzucamy do środka wartość do tej puszki i ją pakujemy
        Optional<String> empty = Optional.of("Java");
        assertTrue(empty.isPresent());
    }

    @Test
    public void stringOptionalReturnIsOk(){
        //wrzucamy do środka wartość do tej puszki i ją pakujemy
        String input = "Java";
        Optional<String> value = Optional.of(input);
        String expected = String.format("Optional[%s]", input);
        assertEquals(expected,value.toString());
        //pierwszej wartości oczekujemy - expected, drugą otrzymujemy czyli wyliczamy
        //pobieramy ze zmiennej optional wartosc ktora jej dalismy
    }
    @Test (expected = NullPointerException.class) //oznaczenie, że oczekujemy, że test nie wyjdzie
    public void nullOptionalIsNotOk() {
        //wrzucamy do środka wartość do tej puszki i ją pakujemy
        Optional<String> empty = Optional.of(null);
        assertFalse(empty.isPresent());
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class) //oznaczenie, że oczekujemy, że test nie wyjdzie i wyskoczy wlasnie ten blad
    public void arrayBeyondIsNotOk() {
        //wrzucamy do środka wartość do tej puszki i ją pakujemy
        int[] tab = {1,3,5,6};
        int val = tab[-1];
    }

    @Test  //oznaczenie, że oczekujemy, że test nie wyjdzie
    public void nullOptionalIsOk() {
        //wrzucamy do środka wartość do tej puszki i ją pakujemy
        Optional<String> empty = Optional.ofNullable(null); //sprawdzamy czy obiekt zawiera nulle
        assertFalse(empty.isPresent());
    }

    @Test  //oznaczenie, że oczekujemy, że test nie wyjdzie
    public void stringOptionalIsOkAndMightProceed() {
        //wrzucamy do środka wartość do tej puszki i ją pakujemy

        String word = "Java";
        if (word !=null){
            System.out.println(word.length());
        }

        Optional<String> WORD = Optional.of(word);
        if (WORD.isPresent()){
            System.out.println(WORD.get().length()); //get pobiera zawartosc optionala
        }

        WORD.ifPresent(s -> System.out.println(s.length()));
    }

    @Test  //oznaczenie, że oczekujemy, że test nie wyjdzie
    public void nullToOptionalIsOkWithElseOption() {
        //wrzucamy do środka wartość do tej puszki i ją pakujemy
        String name = null;
        String person = Optional.ofNullable(name).orElse("NN"); //sprawdzamy czy obiekt zawiera nulle
        assertEquals("NN", person);
    }

    @Test  (expected = IllegalArgumentException.class)//oznaczenie, że oczekujemy, że test nie wyjdzie
    public void nullToOptionalIsOkOrThrowException() {
        String name = null;
        String person = Optional.ofNullable(name).
                orElseThrow(IllegalArgumentException::new);
        assertEquals("NN", person);
    }

    @Test
    public void nullToOptionalIsOkWithElseGetOption() {
        String name = null;
        String person = Optional.ofNullable(name)
                .orElseGet(() -> new String("NN"));
        assertEquals("NN", person);

    }







}
