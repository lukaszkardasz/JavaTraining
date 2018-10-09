package training.Threads.Exercise3;

class CustomThread  extends Thread{

    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            new CustomThread().start();
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("I'm working really hard, uff!!!");
        for(int it=1_000;it<1_010;it++){
            new CustomThread().start();
        }
    }

}
