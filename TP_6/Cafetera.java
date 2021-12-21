package TP_6;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        capacidadMaxima = 100;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        setCantidadActual(getCapacidadMaxima());
    }
    
    public void llenarTaza(int taza){
        if(getCantidadActual() > taza){
            System.out.println("Se lleno la taza");
            setCantidadActual(getCantidadActual() - taza);
        }else{
            System.out.println("No se lleno la taza, solamente se lleno el " + (taza - getCantidadActual()) + " de la taza" );
            setCantidadActual(0);          
        }
    }
    
    public void vaciarCafetera(){
        setCantidadActual(0);
    }
    
    public void agregarCafe(int cantidad){
        int suma = getCantidadActual() + cantidad;
        
        if(suma > getCapacidadMaxima()){
            System.out.println("No se pudo agregar esá cantida, la jarra rebalso");
            llenarCafetera();
        }else{
            setCantidadActual(getCantidadActual() + cantidad);
        }
    }
    
    public void verificar(){
        System.out.println("Capacidad actual de la cafetera: " + getCantidadActual());
    }
    
    
}
