package TP_4;

import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la base del rectangulo");
        setBase(leer.nextInt());
        System.out.println("Ingresar la altura del rectangulo");
        setAltura(leer.nextInt());
    }
    
    public void superficie(){
        System.out.println("La superficie del rectangulo es: "+ (getBase() * getAltura()));
    }
    
    public void perimetro(){
        System.out.println("El perimetro del rectangulo es: " + ((getBase() + getAltura()) * 2));
    }
    
}
