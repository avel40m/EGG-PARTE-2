package TP_7;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private String otroAtributo;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura, String otroAtributo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.otroAtributo = otroAtributo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {        
        if(sexo == 'H' || sexo == 'M' || sexo == 'O')
            this.sexo = sexo;
        else
            System.out.println("No se pudo agregar el sexo, opción incorrecta");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getOtroAtributo() {
        return otroAtributo;
    }

    public void setOtroAtributo(String otroAtributo) {
        this.otroAtributo = otroAtributo;
    }
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPersona(){
        System.out.println("Ingrese su nombre");
        setNombre(leer.next());
        System.out.println("Ingresar edad");
        setEdad(leer.nextInt());
        System.out.println("Ingresar sexo (H - M - O)");
        setSexo(leer.next().toUpperCase().charAt(0));
        System.out.println("Ingresar su peso");
        setPeso(leer.nextDouble());
        System.out.println("Ingresar su altura");
        setAltura(leer.nextDouble());
        System.out.println("Ingrese otro atributo");
        setOtroAtributo(leer.next());
        System.out.println(calcularIMC(peso, altura));
        System.out.println(esMayorDeEdad(edad));
    }
    
    public String calcularIMC(double peso, double altura){
        double calcular = peso * (Math.pow(altura, 2));
        
        if(calcular < 20)
            return "está por debajo de su peso ideal";
        else if(calcular >= 20 && calcular <= 25)
            return "Se encuentra en su peso ideal";
        else
            return "tiene sobrepeso";
    }
    
    public String esMayorDeEdad(int edad){
        if(edad <= 18)
            return "Es menor de edad";
        else
            return "Es mayor de edad";
    }
}
