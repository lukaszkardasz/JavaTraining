package training.Threads.Exercise2;



class ThreadMinus extends Thread {

    private Counter counter;

    public ThreadMinus (Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            counter.decrease();
            try {
                sleep(200);
            } catch (InterruptedException e){
                    e.printStackTrace();
               }

        }
        System.out.println("Minus - done!");
    }
}
