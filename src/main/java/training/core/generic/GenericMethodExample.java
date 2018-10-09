package training.core.generic;

public class GenericMethodExample

    //jedna metoda z wykorzystaniem typu generycznegp załatwia nam wyświetlanie 4 rodzajów różnych typów danych
    //
{
    static <TypGeneryczny> void displayArray(TypGeneryczny[] inArray){
        for (TypGeneryczny i : inArray){
            System.out.printf("%s, ",i);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Integer[] integers = {1,3,6,8,9,12,33};
        Double[] doubles = {0.1,0.3,0.6,6.8,55.9,1.2,3.3};
        Character[] characters = {'H','E','L','L','O' };
        String[] strings = {"Hello", "World", "Welcome"};

        displayArray(integers);
        displayArray(doubles);
        displayArray(characters);
        displayArray(strings);

//        displayArray(converter(strings));
//        displayArray(converter(characters));
//        displayArray(converter(integers));
//        displayArray(converter(doubles));

    }
}
