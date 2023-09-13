import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> produtores = new ArrayList<Integer>();

        Productor produtor = new Productor(produtores);
        Consumer consumidor = new Consumer(produtores);
        Consumer consumidordois = new Consumer(produtores);

        produtor.start();
        consumidor.start();
        consumidordois.start();






    }
}