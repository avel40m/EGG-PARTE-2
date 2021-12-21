package TP_6;

public class Main {

    public static void main(String[] args) {
        Cafetera c = new Cafetera();
        
        c.llenarCafetera();
        c.verificar();
        c.agregarCafe(20);
        c.llenarTaza(50);
        c.verificar();
        c.agregarCafe(20);
        c.verificar();
        c.vaciarCafetera();
        c.verificar();
    }
    
}
