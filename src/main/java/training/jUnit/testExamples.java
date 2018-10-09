package training.jUnit;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testExamples
{
    @Test
    public void wordIsNotEmpty()
    {
        String word = "Franek";
        Assert.assertFalse(word.isEmpty());
    }

    @Test
    public void wordIsEqualToSelfUppercase()
    {
        String input = "Ala";
        String expected = "ALA";
        assertEquals(expected, input.toUpperCase());
    }

    @Test
    public void listContainsParticularWord_isMinLenghtOf3()
    {
        List<String> list = Arrays.asList("Jan", "Julek", "Franek", "John", "Bob", "Ala");
        assertTrue(list.size() > 2);
        assertTrue("List without Ala", list.contains("Ala"));
    }




}
