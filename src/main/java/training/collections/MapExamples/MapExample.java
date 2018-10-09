package training.collections.MapExamples;

import java.util.HashMap;
import java.util.Map;

public class MapExample
{
    public static void main(String[] args) {
        //tworzymy nową mapę
        Map<Integer, String> map0 = new HashMap<>();
        map0.put(102, "Rudy");
        map0.put(103, "Wiesiek");
        map0.put(134, "Gruby");
        map0.put(119, "Wacek");
        //wyswietl cala mape map0
        System.out.println(map0);
        //wyswietl wartosc klucza 102
        System.out.println(map0.get(102));

        Map<KeyMapEntry,String> map1 = new HashMap<>();
        map1.put(new KeyMapEntry(1),"One");
        map1.put(new KeyMapEntry(2),"Two");
        map1.put(new KeyMapEntry(3),"Three");
        System.out.println(map1.size());

    }
}
