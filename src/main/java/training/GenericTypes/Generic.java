package training.GenericTypes;

import java.util.ArrayList;

public class Generic {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add(new String("lalalala1"));
        list.add(new String("lalalala2"));
        list.add(new String("lalalala3"));
        //list.add(new Integer(5));

/*        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        for (String elementListyStringow : list) {
            System.out.println(elementListyStringow);
        }

        Zwykla<String> nazwaZmiennej = new Zwykla<>();
        nazwaZmiennej.setNazwaZmiennejTypuCokolwiek("costam costam String");
        System.out.println(nazwaZmiennej.getNazwaZmiennejTypuCokolwiek());
    }
}

class Zwykla<COKOLWIEK> {

    public void setNazwaZmiennejTypuCokolwiek(COKOLWIEK wartosc) {
        nazwaZmiennejTypuCokolwiek = wartosc;
    }

    public COKOLWIEK getNazwaZmiennejTypuCokolwiek() {
        return this.nazwaZmiennejTypuCokolwiek;
    }

    COKOLWIEK nazwaZmiennejTypuCokolwiek;

}
