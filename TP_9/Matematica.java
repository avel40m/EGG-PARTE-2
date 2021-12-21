
package TP_9;


public class Matematica {
   private double numero1;
   private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
   
   public double devolverMayor(){
       if(getNumero1()> getNumero2())
           return getNumero1();
       else if (getNumero1() < getNumero2())
           return getNumero2();
       else
           return 0;
   }
   
   public void calcularPotencia(){
       int numeroMayor = (int) Math.floor(devolverMayor());
       if(devolverMayor() == getNumero1())
           System.out.println("La potencia de los dos números es: " + Math.pow(numeroMayor, Math.floor(getNumero2())));
       else
           System.out.println("La potencia de los dos números es: " + Math.pow(numeroMayor, Math.floor(getNumero1())));
   }
   
   public void  calcularRaiz(){
       int numero;
       if(devolverMayor() == getNumero1())
          numero = (int) Math.floor(getNumero2());
       else
           numero = (int) Math.floor(getNumero1());
       System.out.println("La raiz cuadrada del  número menor es: " + Math.sqrt(numero));
   }
   
   
}
