import  java.util.*;
import java.util.concurrent.Semaphore;

public class ConsumidorSem extends Thread {
	 Thread cons;
	 private Semaphore semaforo; 
	 
	  ArrayList<Integer> consumidor;

	    public ConsumidorSem(ArrayList<Integer> consumidor) {
	        this.consumidor = consumidor;
	        cons = new Thread();
	        semaforo = new Semaphore(1,true);
	    }


	    @Override
	    public void run() {

	        for (int i = 0; i < 60; i++) {
	                   try {
	                	   
	                		 semaforo.acquire();
	                	   
	                	   if(consumidor.size() > 0){
	   	                    consumidor.remove(0);
	   	                    System.out.println("Consumir:");
	                	   }
	                	   
	                	   
	             
	                        sleep(10);
	                    } catch (InterruptedException e) {
	                        throw new RuntimeException(e);

	                    }
	                    finally {
	                    	semaforo.release();
	                    }
	                }


	            
	        }


	    }
	
