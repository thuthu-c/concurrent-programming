import  java.util.*;

public class Consumer extends Thread {

    Thread cons;
    ArrayList<Integer> consumidor;

    public Consumer(ArrayList<Integer> consumidor) {
        this.consumidor = consumidor;
        cons = new Thread();
    }


    @Override
    public void run() {

        for (int i = 0; i < 60; i++) {
            synchronized (consumidor) {
                if(consumidor.size() > 0){
                    consumidor.remove(0);
                    System.out.println("Consumir:");
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);

                    }
                }


            }
        }


    }
}
