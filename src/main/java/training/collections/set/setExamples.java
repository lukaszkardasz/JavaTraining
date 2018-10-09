package training.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class setExamples
{
    public static void main(String[] args)
    {
        Set<String> stringSet = new TreeSet<String>();
        stringSet.add("Ala");
        stringSet.add("Ala");
        stringSet.add("Ala");
        stringSet.add("Ola");
        stringSet.add("Ula");
        stringSet.add("Ada");

        //wyswietla set bez duplikatów pomimo ich powtarzania się
        System.out.println("Set size: " + stringSet.size());
        System.out.println(stringSet);

        Set<SetEntry> setEntries = new TreeSet<>();
        setEntries.add(new SetEntry("Ala"));
        setEntries.add(new SetEntry("Ola"));
        setEntries.add(new SetEntry("Jan"));
        System.out.println("Entries size: " + setEntries.size());
    }
}
