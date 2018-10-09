package training.Threads.Exercise2;

class ThreadRunner {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        System.out.println(counter.getCount());
        ThreadPlus threadPlus = new ThreadPlus(counter);
        ThreadMinus threadMinus = new ThreadMinus(counter);
        threadMinus.start();
        threadPlus.start();
        //Main sobie wypisuje tylko tekst z pod spodu, a praca Thread plus i minus robi się w wątkach pobocznych
        threadMinus.join(); //czekamy na to aż wątek skończy pracę - join
        threadPlus.join(50);
        System.out.println(counter.getCount()); //wyswietlanie stanu licznika
    }

}

