import  java.util.*;
import java.util.concurrent.Semaphore;

public class ConsumidorSem extends Thread {
	 Thread cons;
	 private Semaphore semaforo; 
	 private String nome;
	 
	  ArrayList<Integer> consumidor;

	    public ConsumidorSem(ArrayList<Integer> consumidor, String nome, Semaphore semaforo) {
	        this.consumidor = consumidor;
			this.nome = nome;
	        cons = new Thread();
			this.semaforo = semaforo;
	    }


		public void consumir (){
			 for (int i = 0; i < 60; i++) {
	                   try {
	                	   
	                		semaforo.acquire();
	                	   
	                	   if(consumidor.size() > 0){
	   	                    consumidor.remove(0);
	   	                    System.out.println(this.nome + " está consumindo: " + i);
	                	   }
	                	   
	                	   
	             
	                        sleep(100);
	                    } catch (InterruptedException e) {
	                        throw new RuntimeException(e);

	                    }
	                    finally {
	                    	semaforo.release();
	                    }
	                }


	            System.out.println("Acabou:" + this.nome);
	        }

			
		


	    @Override
	    public void run() {
			consumir();
	    }
	}
	
