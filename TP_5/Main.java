package TP_5;

public class Main {

    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        
        c.creaCuenta();
        c.consultarDatos();
        System.out.println("===============");
        c.retirar(2000);
        System.out.println("===============");
        c.consultarDatos();
        c.extraccionRapida();
        System.out.println("===============");
        c.consultarDatos();
    }
    
}
