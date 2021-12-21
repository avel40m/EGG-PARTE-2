package TP_3;

import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo número");
        setNumero2(leer.nextInt());
    }
    
    public void suma(){
        System.out.println("La suma es: " + (getNumero1() + getNumero2()));
    }
    
    public void restar(){
        System.out.println("La resta es: " + ((double) getNumero1() - getNumero2()));
    }
    
    public void multiplicar(){
        if(getNumero1() == 0 || getNumero2() == 0)
            System.out.println("Error, uno de los dos número es 0, no se llevo acabo la operación");
        else
            System.out.println("La multiplicación es: "+(getNumero1() * getNumero2()));
    }
    
    public void division(){
        if(getNumero2() == 0)
            System.out.println("Error, el divisor es 0, no se llevo acabo la operación");
        else
            System.out.println("La división es: " + ((double) getNumero1() / getNumero2()));
    }
}
