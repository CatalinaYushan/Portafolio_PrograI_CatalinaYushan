package examen1_catalinayushan;

import java.util.Scanner;

public class Examen1_CatalinaYushan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int opcion = 0;
        boolean choice=true;
        System.out.println("Hola, bienvenido al menu!");
        System.out.println("1. Ejercicio de Palabras");
        System.out.println("2. Salir");

        System.out.println("Presione el numero que desea realizar: ");
        
        switch(opcion){
            case 1:
                EjercicioPalabras();
                break;
            case 2:
                break;
            default:
                System.out.println("Regrese pronto!");   
        }
}
    public static void EjercicioPalabras(String m, String k){
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese una oracion o frase: ");
        String phrase = input.nextLine();
        System.out.println("Ingrese una segunda oracion o frase: ");
        String wordle = input.nextLine();
        String nothing = "";
        String spaces = phrase.toLowerCase();
        String blanck = wordle.toLowerCase();

        for (int k = wordle.lenght()-1; k >= 0; k--) {
            nothing=nothing+wordle.chartAt(k);     
        }  
        if (phrase>wordle);
        System.out.println(phrase+wordle);
    }
    if (opcion > 2){
        System.out.println("Su opcion no es valida. Ingrese otro numero del menu!: ");
        do{
            opcion = input.nextLine();
        }
        while(opcion > 2 ); 
 }
   
