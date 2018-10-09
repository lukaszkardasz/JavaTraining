package training.core.ShallowVsDeepCopy;

class Copy {



    static class Adres {
        private String city;
        private String street;
        private int number;

        public Adres(String city, String street, int number) {
            this.city = city;
            this.street = street;
            this.number = number;
        }

        @Override
        public String toString() {
            return city + " " + street + " " + number;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

    public static void main(String[] args) {
        Person father = new Person("John", new Adres("Bialystok","Rolna", 74));
        Person son = new Person (father);
        son.setName("William");
        System.out.println(father);
        System.out.println(son);
        System.out.println("_______________");
        son.getAdres().setCity("Warszawa");
        son.getAdres().setStreet("Polkowa");
        son.getAdres().setNumber(14);
        System.out.println(father);
        System.out.println(son);
    }

}
