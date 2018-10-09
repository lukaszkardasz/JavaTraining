package training.Threads.Exercise2;

class ThreadPlus extends Thread{

    private Counter counter;

    public ThreadPlus (Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            counter.increase();
            try {
                sleep(200);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("Plus - done!");
    }
}
