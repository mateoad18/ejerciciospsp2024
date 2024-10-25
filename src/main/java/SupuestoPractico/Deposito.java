package SupuestoPractico;

public class Deposito extends Thread {
    private int depositados=0;
    private String [] globos;
    private long contador=0;

    public void Deposito(){
        globos=new String[10];
    }
    public  synchronized void reponer(String globo){
        if(depositados== globos.length){
            try {
                wait();
            }catch (InterruptedException e){}
        }
        globos[depositados++]=globo;
        notify();
    }

    @Override
    public void run() {

        while (true){
            String globo = String.format("%d", ++contador);
            Deposito d = new Deposito();
            d.reponer(globo);
            System.out.println("globo " + globo + " repuesto");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
