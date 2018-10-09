package training.Threads.Exercise1;

class ThreadRunner {

    public static void main(String[] args) {


        //różnica pomiedzy tym jak się uruchamia wątki

        MyRunnable myR = new MyRunnable();

        Thread t_m = new Thread(myR);
        t_m.start();
        //myR.run();

        for (int i = 0; i<1000l;i++) {
            System.out.println(i);
        }
    }
}
