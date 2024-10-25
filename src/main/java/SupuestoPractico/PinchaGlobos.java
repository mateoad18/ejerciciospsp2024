package SupuestoPractico;

public class PinchaGlobos extends Thread {
    Globo globo = new Globo();
    public void PinchaGlobos(Globo globo){
        this.globo=globo;
    }
    @Override
    public void run() {
        try{
            globo.PincharGlobo();
            wait();
        }catch (InterruptedException e){}
    }
}
