package TP_5;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void creaCuenta(){
        System.out.println("Ingrese su número de cuenta");
        setNumeroCuenta(leer.nextInt());
        System.out.println("Ingresar su D.N.I.");
        setDni(leer.nextLong());
        System.out.println("Ingresar el saldo actual");
        setSaldoActual(leer.nextDouble());
    }
    
    public void retirar(double retiro){
        if(getSaldoActual() < retiro)
            setSaldoActual(0);
        else
            setSaldoActual(getSaldoActual() - retiro);
    }
    
    public void extraccionRapida(){
       double band = 0;
        System.out.println("Solamente se le permitirá sacar el 20% como maximo de su saldo");
        System.out.println("Ingresar el monto a retirar");
        double retiro = leer.nextDouble();
        
        band = getSaldoActual() * 0.20;
        
        if(retiro > band)
            System.out.println("No se pudo efectuar la operación");
        else
            setSaldoActual(getSaldoActual() - (getSaldoActual() * 0.2));
        
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo es de: $" + getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println("Número de cuenta: " + getNumeroCuenta());
        System.out.println("Número de D.N.I.: " + getDni());
        System.out.println("Saldo actual: $" + getSaldoActual());
    }
}
