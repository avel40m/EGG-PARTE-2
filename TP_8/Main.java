package TP_8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cadena c = new Cadena();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresar frase");
        c.setFrase(leer.next());        
        //Longitud de la frase       
        c.setLongitud(c.getFrase().length());
        
        c.contarVocales();
        
        System.out.println("Ingrese la letra para verificar cuantas veces se repite");
        c.vecesRepetido(leer.next().charAt(0));
        
        System.out.println("Ingrese una nueva frase");
        c.compararFrase(leer.next());
        
        System.out.println("Ingrese la frase para unir");
        c.unirFrase(leer.next());
        
        System.out.println("Ingrese la letra a remplazar");
        c.reemplazar(leer.next().charAt(0));
        
        System.out.println("Chequear si existe la letra");
        c.contiene(leer.next());
        
    }
    
}
