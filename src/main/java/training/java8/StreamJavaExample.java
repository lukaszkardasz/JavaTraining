package training.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamJavaExample
{

    public static void main(String[] args)
    {
        String[] input =
            {"Ala", "kot", "Tom", " ", null, "23456", ""};

        StreamJavaExample app = new StreamJavaExample();
        app.printArray(input);
        bar();
        app.printNotEmptyEntries(input);
        bar();
        app.randomize(14);
        app.numberStatistics();
    }

    private void numberStatistics()
    {
        List numbers = Arrays.asList(3,4,5,6,1,4,6,9,11);
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(x -> Integer.parseInt(x.toString()))
                .sorted()
                .summaryStatistics();
        bar();
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println(String.format ("Avg %.2f ", stats.getAverage()));
        System.out.println("Amt: " + stats.getCount());
    }

    private void randomize(int lim)
    {
        int[] ints = new Random()
                .ints(0, 100)
                .limit(lim)
                .toArray();
        System.out.println("Random all ints");
        Arrays.stream(ints)
                .forEach(System.out::println);
        System.out.println("Random all sorted");
        Arrays.stream(ints)
                .sorted()
                .forEach(System.out::println);
        System.out.println("Random all sorted unique");
        Arrays.stream(ints)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    private void printArray(String[] array)
    {
        Arrays.stream(array)
                .forEach(System.out::println);
    }

    private void printNotEmptyEntries(String[] array)
    {
        List<String> entries = Arrays.asList(array);

        List<String> list = entries.stream()
                .filter(Objects::nonNull)
                .map(entry -> entry.trim())
                .filter(entry -> !entry.isEmpty())
                .collect(Collectors.toList());
        String[] strings = list.toArray(new String[0]);
        printArray(strings);
    }

    private static void bar()
    {
        System.out.println("___________");
    }

}
