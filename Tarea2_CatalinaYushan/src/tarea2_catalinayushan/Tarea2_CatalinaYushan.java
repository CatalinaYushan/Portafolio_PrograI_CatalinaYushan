package tarea2_catalinayushan;

import java.util.Scanner;

public class Tarea2_CatalinaYushan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int opcion = 0;
        boolean choice=true;
        System.out.println("Hola, bienvenido al menu!");
        System.out.println("1. Replace");
        System.out.println("2. Factorial");
        System.out.println("3. Mensajes");
        System.out.println("4. Promedios");
        System.out.println("5. Aprobado y Reprobado");
        System.out.println("6. Contains");
        System.out.println("Presione el numero que desea realizar: ");
        
        switch(opcion){
            case 1:
                miMetododeReemplazo();
                break ;
            case 2:
                Factorial();
                break;
            case 3:
                Mensaje();
                break ;
            case 4:
                Promedios();
                break;
            case 5:
                Aprobado_Reprobado();
                break;
            default:
                choice=false;
                break;
        }
       
    }
    public static int miMetododeReemplazo (String palabra){
    String saludo_inicial = "holaaaa";
    String cambio_inicial = saludo_inicial.replace("a","b");
    System.out.println(cambio_inicial);
        return 0;
    }
    
    public static int Factorial (int k){
    if(k == 1){
        System.out.println("factorial(" + k + ") = 1");
	return 1;
		} else {
		System.out.println("factorial(" + k + ") = " + k + " * factorial(" + (k - 1) + ")");
		return k * Factorial(k - 1);
		}
        
    }
    
    public static void Mensaje(String word){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una oracion o palabra: ");
        String palabra = input.nextLine();
        String frase = palabra.toLowerCase();
        System.out.println("Has ingresado: "+frase);

    }
    
    public static void Promedios (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-- Bienvenido al sistema de calculo de promedio --");
        System.out.print("Ingrese su nombre:");
        String nombre = entrada.nextLine();
        
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase: ");
        double segundaClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la tercera clase: ");
        double terceraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la cuarta clase:  ");
        double cuartaClase = entrada.nextDouble();
        
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase / 4;

        System.out.println("-----" + nombre +  "tu promedio de las cuatros clases es: " + promedio);
        
    }
    
    public static int Aprobado_Reprobado (int nota);
    Scanner
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    private static void Mensaje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void Factorial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void miMetododeReemplazo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
      
}



    

