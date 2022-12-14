package prueba2_catalinayushan2;

import java.util.Scanner;
import java.util.ArrayList;

public class Prueba2_CatalinaYushan2 {

    public static void main(String[] args) {
        Scanner quaxly = new Scanner(System.in);
        System.out.println("---Bienvenido al creador de figuaras de Cata *_* !---");
        System.out.println("---Escoge la figura que deseas crear---");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Rectangulo");
        System.out.println("4. Salir");
        System.out.print("-------------------------");
        System.out.print("Ingrese la opcion deseado: ");
        int choice = quaxly.nextInt();
        ArrayList<Integer> Area = new ArrayList<Integer>();
        ArrayList<Integer> Volumen = new ArrayList<Integer>();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Genial! Escogiste el cuadrado.");
                    System.out.println("Que deseas hacer?");
                    System.out.println("1. Area");
                    System.out.println("2. Volumen");
                    System.out.println("Ingrese su opcion: ");
                    int number = quaxly.nextInt();

                    if (number == 1) {
                        Area square = new Area(9, 12);
                        System.out.println("El area del cuadrado es:" + Area.getArea);
                        Area.add(scanner.next());
                    } else {
                        Volumen 
                    }
                    square = new Volumen(3);
                        System.out.println("El volumen de su cuadrado es:");
                    Volumen.add(scanner.next());
                    break;
                case 2:
                    System.out.println("Genial! Escogiste el cuadrado.");
                    System.out.println("Que deseas hacer?");
                    System.out.println("1. Area");
                    System.out.println("2. Volumen");
                    System.out.println("Ingrese su opcion: ");
                    int number1 = quaxly.nextInt();

                    if (number1 == 1) {
                        Area triangle = new Area(9, 12);
                        System.out.println("El area del triangulo es:" + Area.getArea);
                        Area.add(scanner.next());
                    } else {
                        Volumen 
                    }
                    triangle = new Volumen(3);
                        System.out.println("El volumen de su triangulo es:");
                    Volumen.add(scanner.next());
                case 3:
                    System.out.println("Genial! Escogiste el cuadrado.");
                    System.out.println("Que deseas hacer?");
                    System.out.println("1. Area");
                    System.out.println("2. Volumen");
                    System.out.println("Ingrese su opcion: ");
                    int number2 = quaxly.nextInt();

                    if (number2 == 1) {
                        Area rectangle = new Area(9, 12);
                        System.out.println("El area del rectangulo es:" + Area.getArea);
                        Area.add(scanner.next());
                    } else {
                        Volumen 
                    }
                    rectangle = new Volumen(3);
                        System.out.println("El volumen de su rectangulo es:");
                    Volumen.add(scanner.next());
                case 4:
                    System.out.println("Adios!");
                    break;
                default:

            }
            while (choice < 4);

        }
    }
