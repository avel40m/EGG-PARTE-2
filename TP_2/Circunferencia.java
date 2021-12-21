package TP_2;

import java.util.Scanner;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircuferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        this.radio = leer.nextDouble();
    }
    
    public void area(){
        System.out.println("El area de la circuferencia es: " + (Math.PI *(Math.pow(this.radio, 2))));
    }
    
    public void perimetro(){
        System.out.println("El perimetro de la circuferencia es: "+ (2 * Math.PI * this.radio ));
    }
}
