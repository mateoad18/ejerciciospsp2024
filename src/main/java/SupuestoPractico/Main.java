package SupuestoPractico;

public class Main {
    public static void main(String[]args){
        HinchaGlobos HG1 = new HinchaGlobos();
        HinchaGlobos HG2 = new HinchaGlobos();
        HinchaGlobos HG3 = new HinchaGlobos();
        HinchaGlobos HG4 = new HinchaGlobos();
        HinchaGlobos HG5 = new HinchaGlobos();
        PinchaGlobos PG1 = new PinchaGlobos();
        Deposito Rep = new Deposito();
        Rep.start();
        HG1.start();
        HG2.start();
        HG3.start();
        HG4.start();
        HG5.start();
        PG1.start();



    }
}
