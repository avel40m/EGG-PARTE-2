package TP_10;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private Date nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    private Scanner leer = new Scanner(System.in);
    
    private Date pasarFecha(String dia){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(dia);
        } catch (Exception e) {
            System.out.println(e);
        }
        return fecha;
            
        
    }
    
    public void crearPersona(){
        System.out.println("Ingrese su nombre");
        setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento");
        String fecha = leer.next();
        setNacimiento(pasarFecha(fecha));
    }
    
    public void calcularEdad(){
        Date fecha = getNacimiento();
        Period edad = Period.between(LocalDate.of(fecha.getYear()+1900, fecha.getMonth()+1,fecha.getDate()), LocalDate.now());
        System.out.println("Su edad es de: "+edad.getYears() + " años");
    }
    
    private boolean menorQue(int edad){
        if(edad >= 18){
            return true;
        }else{
            return false;
        }
    }
    
    public void mayorEdad(){
        Date fecha = getNacimiento();
        Period edad = Period.between(LocalDate.of(fecha.getYear()+1900,fecha.getMonth()+1,fecha.getDate()), LocalDate.now());
        if(menorQue(edad.getYears()) == true)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");
    }
    
    public void mostrarDatos(){
        System.out.println("Su nombre es: " + getNombre());
        System.out.println("Su fecha de nacimiento es: " + getNacimiento());
    }
}
