package SupuestoPractico;

public class HinchaGlobos extends Thread{
    Globo globo = new Globo();
    public void HinchaGlobos(Globo globo){
        this.globo=globo;
    }
    @Override
    public void run() {
        try{
             if (globo.getVolumen()<=5){
                 globo.HincharGlobo();
                 notify();
             }else {
                wait();
             }
        }catch (InterruptedException e){}

    }
}
