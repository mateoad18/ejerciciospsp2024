package Unidad2.Ejemplo11;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen(10);
        Productor productor1 = new Productor(almacen, 100);
        Consumidor consumidor1 = new Consumidor(almacen, 1000);
        Productor productor2 = new Productor(almacen, 200);
        Consumidor consumidor2 = new Consumidor(almacen, 2000);
        productor1.start();
        consumidor1.start();
        productor2.start();
        consumidor2.start();
    }
}
