package TP_8;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public void contarVocales(){
        int cont = 0;
        for (int i = 0; i < getFrase().length(); i++) {
            if(getFrase().charAt(i) == 'a' || getFrase().charAt(i) == 'e' || getFrase().charAt(i) == 'i' || getFrase().charAt(i) == 'o' || getFrase().charAt(i) == 'u')
                cont++;
        }
        System.out.println("Cantidad de vocales: " + cont);
    }
    
    public void vecesRepetido(char letra){
        int contador = 0;
        
        for (int i = 0; i < getFrase().length(); i++) {
            if(getFrase().charAt(i) == letra)
                contador++;
        }
        
        System.out.println("La letra "+letra+" se repite "+contador+" veces.");
    }
    
    public void compararFrase(String frase){
        int cont = frase.length();
        
        if(getLongitud() == cont)
            System.out.println("Tiene la misma longitud");
        else
            System.out.println("No tiene la misma longitud");
    }
    
    public void unirFrase(String frase){
        System.out.println("La frase concatenada es: " + getFrase().concat(frase));
    }
    
    public void reemplazar(char frase){
        System.out.println(getFrase().replace('a',frase));
    }
    
    public void contiene(String letra){
        System.out.println("La frase "+getFrase().contains(letra)+" contiene la letra");
    }
}
