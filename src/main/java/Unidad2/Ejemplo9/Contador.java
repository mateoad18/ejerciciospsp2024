package Unidad2.Ejemplo9;

public class Contador {

    private int n;

    public Contador(int n) {
        this.n = n;
    }

    public synchronized void inc() {
        n++;
    }

    public int get() {
        return n;
    }

}
