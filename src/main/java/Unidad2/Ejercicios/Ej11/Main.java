package Unidad2.Ejercicios.Ej11;

public class Main {
    private static Contador c = new Contador(100);
    private static void run() {
        for (int i = 0; i < 100; i++) {
            if(c.get()==300){
                try{
                    c.wait();
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else{
                 c.inc();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(Main::run);
        Thread t2 = new Thread(Main::run);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Contador = " + c.get());
    }
}

