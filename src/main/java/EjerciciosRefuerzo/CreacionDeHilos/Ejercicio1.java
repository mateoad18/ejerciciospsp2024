package EjerciciosRefuerzo.CreacionDeHilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ejercicio1 implements Runnable{
    long tiempo ;

    public Ejercicio1(long tiempo){
        this.tiempo=tiempo;
    }
    public static void main(String []args){
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i=0;i<20;i++){
            service.submit(new Ejercicio1(tiempo:i * 500));
        }
    }

    @Override
    public void run() {
    System.out.println(Thread.currentThread().getName()+" dormira "+tiempo+" milisegundos");
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" ha finalizado");

    }
}
