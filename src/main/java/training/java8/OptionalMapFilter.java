package training.java8;

import org.junit.Test;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static junit.framework.TestCase.assertTrue;

public class OptionalMapFilter {
    //czy hasło spełnia wymagania sprawdzamy -- Yoda :P
    @Test
    public void passwordFillRequarments (){
        String pass  = " TrustNo1";

        //sprawdzamy czy ma min długość 8 znaków
        Optional<String> optPass = Optional.of(pass); //przypisujemy hasło do optionala
        Integer len = optPass.map(s -> s.length()).orElse(0); //mapa zmienia jeden typ danych na inny np String na int
        assertTrue("Too short!",len>=8); //tu po przecinku przed warunkiem można wpisać wiadomość błędu

        boolean correct = optPass
                .filter(p -> {
                    Pattern pattern = Pattern.compile("[A-Z]");
                    Matcher matcher = pattern.matcher(p);
                    return matcher.find();
                })
                .filter(p -> {
                    Pattern pattern = Pattern.compile("[0-9]");
                    Matcher matcher = pattern.matcher(p);
                    return matcher.find();
                })
                .isPresent();
        assertTrue(correct);

    }

}
