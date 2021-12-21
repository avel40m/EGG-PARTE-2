package TP_9;

public class Main {

    public static void main(String[] args) {
        Matematica m = new Matematica();
        
        m.setNumero1((Math.random()* 10 + 1));
        m.setNumero2(Math.random() * 10 + 1);
        
        System.out.println("El número mayor es: " + m.devolverMayor());
        m.calcularPotencia();
        m.calcularRaiz();
    }
    
}
