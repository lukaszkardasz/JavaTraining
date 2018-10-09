package training.collections.list;

import java.util.*;

public class ListExamples
{
    //robimy 2 rodzaje listy
    //array i linked list - potem sprawdzimy co bedzie dzialalo szybciej
    //do listy można dodawać obiety tylko które są jednego typu lub wywodzą się z tego typu

    static List<Integer> integerLinkowanaLista;
    static List<Integer> integerArrayLista;

    public static void main(String[] args)
    {
        integerArrayLista = new ArrayList<>();
        integerLinkowanaLista = new LinkedList<>();

        //liczymy czas
        Date startTime;
        Date endTime;

        System.out.println("Test listy linkowanej");
        startTime = new Date();
        for (long i = 0; i < 100000; i++)
            {
                integerLinkowanaLista.add(0, 10);
            }
        endTime = new Date();
        long runTime = endTime.getTime() - startTime.getTime();
        System.out.println("Czas działania listy linkowanej: " + runTime);

        //*********************************************************************************

        System.out.println("Test listy array");
        startTime = new Date();
        for (long i = 0; i < 100000; i++)
        {
            integerArrayLista.add(0, 10);
        }
        endTime = new Date();
        runTime = endTime.getTime() - startTime.getTime();
        System.out.println("Czas działania listy array: " + runTime);

        //Zmieniamy typ array list na linked list  lub odwrotnie za pomocą narzedzia Arrays.asList

        //from array to list
        Arrays.asList(integerArrayLista);
        //from list to array
        integerLinkowanaLista.toArray();

        integerLinkowanaLista = new LinkedList<>();
        integerLinkowanaLista.add(3);
        integerLinkowanaLista.add(4);
        integerLinkowanaLista.add(36);
        integerLinkowanaLista.add(-3);

            for (Integer el : integerLinkowanaLista)
            {
                System.out.println(el);
            }
        Collections.sort(integerLinkowanaLista);

        System.out.println("***** a teraz posortowana******");
            for (Integer el : integerLinkowanaLista)
        {
            System.out.println(el);
        }


        //dodawanie wartości do obiektu LISTA w trakcie jego inicjalizacji z new
                integerLinkowanaLista = new LinkedList<Integer>()
        {{
            add(7);
            add(-9);
            add(0);
        }};
        //calkiem niezle wyglada co :)

        //a teraz odwaracamy kolejnosć elementów
        Collections.reverse(integerLinkowanaLista);
        System.out.println("Kolejność odwrócona------------");
        System.out.println(integerLinkowanaLista);



    }
}
