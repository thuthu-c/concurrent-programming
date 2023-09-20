import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class ProdutorSem extends Thread{
	Thread prod;
    ArrayList<Integer> produtos;
    Semaphore semaforoprod; 

    public ProdutorSem(ArrayList<Integer>  produtos){
        prod = new Thread();
        this.produtos = produtos;
        semaforoprod = new Semaphore(1,true);

    }


    @Override
    public void run(){
        for (int i = 0; i <60 ; i++) {
                try {
                    semaforoprod.acquire();
                    produtos.add(1);
                    System.out.println("Produzir:");
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                finally{
                    semaforoprod.release();
                }
            
        }




    }

}
