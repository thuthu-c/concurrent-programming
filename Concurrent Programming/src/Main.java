import java.util.*;
import java.util.concurrent.Semaphore;


public class Main {

    public static  void main(String[] args) {
        ArrayList<Integer> produtores = new ArrayList<Integer>();
        Semaphore semaforomain = new Semaphore(1, true);

        ProdutorSem produtor = new ProdutorSem(produtores, semaforomain);
        ConsumidorSem consumidor = new ConsumidorSem(produtores, "Consumidor 1",semaforomain);
        //ConsumidorSem consumidordois = new ConsumidorSem(produtores, "Consumidor 2",semaforomain);

        produtor.start();
        consumidor.start();
        //consumidordois.start();






    }
}