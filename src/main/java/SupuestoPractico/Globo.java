package SupuestoPractico;

public class Globo {
    private int volumen;

    public void Globo(){
        this.volumen=0;
    }
    public synchronized void HincharGlobo(){
       try {
           if (volumen <= 5) {
               volumen++;
               System.out.println("El globo se esta hinchando. Volumen: " + volumen);
               notify();
           } else {
               System.out.println("El globo ha estallado");
               wait();
           }
       }catch (InterruptedException e){
       }
    }
    public synchronized void PincharGlobo(){
       try {
           System.out.println("El globo ha sido pinchado");
           notify();
           wait();
       }catch (InterruptedException e){
       }
    }
    public int getVolumen(){
        return volumen;
    }
}
