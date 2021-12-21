package TP_1;

import java.util.Scanner;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPagina;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }
    
    public void crearLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el numero de ISBN");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese el titulo del libro");
        this.titulo = leer.next();
        System.out.println("Ingrese el autor del libro");
        this.autor = leer.next();
        System.out.println("Ingrese las paginas del libro");
        this.numeroPagina = leer.nextInt();
    }
    
    public void verLibro(){
        System.out.println("El número del libro: "+this.ISBN);
        System.out.println("El titulo del libro es: "+this.titulo);
        System.out.println("El titulo del autor es: "+this.autor);
        System.out.println("Las paginas del libro es: "+this.numeroPagina);
    }
}
