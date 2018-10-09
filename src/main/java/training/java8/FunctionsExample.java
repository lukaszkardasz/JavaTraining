package training.java8;
import java.util.LinkedList;
import java.util.List;

class FunctionsExample {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>() {{
            add("One");
            add("Star Wars");
            add("Rick and Morty");
            add("Friday");
        }};

        printListJava7Fashion(list);
        printListJava8Fashion(list);
    }

    private static void printListJava8Fashion(List<String> list) {
        list.forEach(System.out::println);
        /*
        rozne sposoby na wywolanie metod lambda
        e->metodaNa(e);
        () -> something();
        (a,b) -> calculate(a,b);
        (a,b) -> {
                calculate(a,b);
                storeInFile(a,b);
                return a+b;
        }
        */
    }

    private static void printListJava7Fashion(List<String> list) {
        for (String el : list) {
            System.out.println(el);
        }
    }

}