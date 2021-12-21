package TP_12;

import java.util.Scanner;

public class NIF {
    private long dni;
    private char letra;

    public NIF() {
    }

    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    private Scanner leer = new Scanner(System.in);
    private static String[][] array = {{"0","T"},{"1","R"},{"2","W"},{"3","A"},{"4","G"},{"5","M"},{"6","Y"}
    ,{"7","F"},{"8","P"},{"9","D"},{"10","X"},{"11","B"},{"12","N"},{"13","J"},{"14","Z"},{"15","S"},{"16","Q"}
    ,{"17","V"},{"18","H"},{"19","L"},{"20","C"},{"21","K"},{"22","E"}};
    
    public void crearNIF(){
        System.out.println("Ingrese su D.N.I.");
        setDni(leer.nextLong());
        int resto = (int) getDni() % 23;
        for (int i = 0; i < array.length; i++) {
            if(Integer.parseInt(array[i][0]) == resto)
                setLetra(array[i][1].charAt(0));
        }
    }
    
    public void mostrar(){
        System.out.println("Su N.I.F. es: "+getDni()+"-"+getLetra());
    }
}
