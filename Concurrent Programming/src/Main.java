import java.util.*;


public class Main {

    public static  void main(String[] args) {
        ArrayList<Integer> produtores = new ArrayList<Integer>();

        ProdutorSem produtor = new ProdutorSem(produtores);
        ConsumidorSem consumidor = new ConsumidorSem(produtores);
        ConsumidorSem consumidordois = new ConsumidorSem(produtores);

        produtor.start();
        consumidor.start();
        consumidordois.start();






    }
}