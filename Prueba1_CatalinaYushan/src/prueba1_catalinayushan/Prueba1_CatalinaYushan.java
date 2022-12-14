package prueba1_catalinayushan;

import java.util.Scanner;

public class Prueba1_CatalinaYushan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("---Bienvenido!---"); //Menu principal
        System.out.println("1. Repetir Mi Nombre ");
        System.out.println("2. Sub Menu de Mensajes ");
        System.out.println("3. Salir ");
        
        System.out.println("Por favot digite una de las opciones: ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                int loop_nombre; // Repetir mi nombre. Hice uso de un for para crear el bucle pedido
                System.out.println("Ingrese su nombre: ");
                int Nombre_Estudiante = input.nextInt();
                System.out.println("Ingrese el numero de veces que desea repetir su nombre: ");
                loop_nombre = input.nextInt();
               
                for(int c = 0; c < loop_nombre; c++){
                    System.out.println("¡Hola mi nombre es” +Nombre_Estudiante+” y miren mi prueba!");
                    c++;
                }
                break;
                
            case 2:
                System.out.println("---Bienvenido al Sub-Menu!---"); // Sub-menu. No logre regresar la opcion tres al principio
                
                System.out.println("1. Bienvenida");
                System.out.println("2. Despedidada");
                System.out.println("3. Salir");
                int opcion = input.nextInt();
                
                if (opcion == 1){
                System.out.println("Hola! Como estas?");
                                      if(opcion == 2){
                                      System.out.println("“Hasta luego, gracias por usar mi programa");
                                      }
                }else{
                    if (opcion == 3){
                        
                        
                    }
                 }
                break;
                
            case 3:
                System.out.println("Adios! Esta fue mi prueba! "); // Salida del menu
                break;
            default:
        }
        
      
    }
    
}


// A pesar de no lograr alcanzar cierta indicaciones, utilice herramientas de java como el for, switch case, while, y if para crear un programa que sea capaz d
// de imprimir los datos ingresados por el usuario.

// Mientras programaba la primera opcion, intente hacer uso de un while para crear que bucle a base de los datos del usuario pero decidi guiarme con un for'
// ya que este resulto ser mas suficiente que el anterior. Comence el codigo llamado al scanner y ingresando las diferentes opciones del menu principal. Hice 
// uso de un switch case para la elaboracion del menu. A continuacion vemos como en el caso de 'Repetir mi nombre' se hace uso de un for para el bucle como
// mencionamos anteriormente. Dentro de la siguiente opcion se usan if's y while para la creacion del submenu. En la ultima parte simplemente se cierra el
// programa.