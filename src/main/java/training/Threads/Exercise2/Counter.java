package training.Threads.Exercise2;

/*
licznik w jednym watku liczy o 10 w dol i odpalamy go w jednym watku, następnie w kolejnym watku
zwiekszamy licznik o 10 w drugim watku, odpalając to bez synchronizacji wątki konkurują ze sobą o dostęp do pamięci
ze zmiennymi i mogą mieć inne wartości
*/

class Counter {

    private int count;
    private Object lock1;
    private Object lock2;

    void increase(){ //synchronizacja na poziomie metody - synchronized przed void
        synchronized (this) { //synchronizacja całej klasy czyli synchronized (this - klasa) {blok kodu} w metodzie
            count++;
        }
    }
    void decrease(){
        synchronized (lock2) {
            count--;
        }
    }
    int getCount(){return count;}
}
