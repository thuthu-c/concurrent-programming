import  java.util.*;

public class Productor extends Thread{

    Thread prod;
    ArrayList<Integer> produtos;

    public Productor(ArrayList<Integer>  produtos){
        prod = new Thread();
        this.produtos = produtos;

    }


    @Override
    public void run(){
        for (int i = 0; i <60 ; i++) {
            synchronized (produtos){
                produtos.add(1);
                System.out.println("Produzir:");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }




    }

}