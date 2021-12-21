package TP_11;

public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
//    Calcula  (b^2)-4*a*c  el discriminante
    public double getDiscriminante(){
        return (Math.pow(b, 2) - 4 * a * c);
    }
//    si tiene dos raices ej: 25,16,9....
    public boolean tieneRaices(){
        if(getDiscriminante() > 0)
            return true;
        else
            return false;
    }
//   si tiene una sola raiz ej: a=1 b=4 c=4 
    public boolean tieneRaiz(){
        if(getDiscriminante() == 0)
            return true;
        else
            return false;
    }
//    obtener raices
    public double obtenerRaices(){
       if(tieneRaices() == true)
            return Math.sqrt(getDiscriminante());
       return 0;
    }
//    si tiene una solucion
    public double obtenerRaiz(){
        if(tieneRaiz() == true)
           return Math.sqrt(getDiscriminante());
        return 0;
    }
    
    public void calcular(){
        if(tieneRaiz() == true){
            System.out.println("X = " + (-b + obtenerRaiz())/(2*a));
        }else if(tieneRaices() == true){
            System.out.println("X1 = " +(-b + obtenerRaices())/(2 * a));
            System.out.println("X2 = " +(-b - obtenerRaices())/(2 * a));
        }else
            System.out.println("Solución indefinida");
    }
    
}
