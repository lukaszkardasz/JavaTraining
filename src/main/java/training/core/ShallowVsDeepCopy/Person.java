package training.core.ShallowVsDeepCopy;

class Person {

    private String name;
    private Copy.Adres adres;

    public Person(String name, Copy.Adres adres) {
        this.name = name;
        this.adres = adres;
    }

    public Person (Person origin){
        this.name = origin.name;
        Copy.Adres adr = origin.getAdres();
        this.adres = new Copy.Adres(adr.getCity(),adr.getStreet(), adr.getNumber());
        this.adres = origin.adres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Copy.Adres getAdres() {
        return adres;
    }

    public void setAdres(Copy.Adres adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name: '" + name + '\'' +
                ", adres: " + adres +
                '}';
    }


}
