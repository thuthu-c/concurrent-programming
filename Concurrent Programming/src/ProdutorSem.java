import java.util.ArrayList;
import java.util.concurrent.Semaphore;


public class ProdutorSem extends Thread {
    ArrayList<Integer> produtos;
    Semaphore semaforoprod;

    public ProdutorSem(ArrayList<Integer> produtos, Semaphore semaforoprod) {
        this.produtos = produtos;
        this.semaforoprod = semaforoprod;
    }

    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            try {
                semaforoprod.acquire();
                produtos.add(1);
                System.out.println("Produzir: " + i);
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                semaforoprod.release();
            }
        }
    }
}