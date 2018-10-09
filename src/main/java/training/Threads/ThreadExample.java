package training.Threads;

class ThreadExample {

    public static void main(String[] args)  {

        new Thread (new Runnable() {
            @Override
            public void run() { //nowy watek i run to miejsce do wystartowania do nowego watku, tak samo jak main w javie

                displayNumbers(100);
            }
        },"SuperWątek!").start();

        new Thread (() -> {
            displayNumbers(150);
        },"LambdaWąt").start();

        displayNumbers(50);
    }

    private static void displayNumbers(int sleep) {
        for (int i=0; i<500;i++){
            String name = Thread.currentThread().getName(); //wyswietlanie nazwy watku
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(sleep);
            } catch(InterruptedException e){
                e.printStackTrace();
              }
        }
    }

}
