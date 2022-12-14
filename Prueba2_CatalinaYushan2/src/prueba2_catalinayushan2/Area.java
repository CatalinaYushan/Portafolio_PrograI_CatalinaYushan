package prueba2_catalinayushan2;

import java.util.Scanner;

public class Area {
    int length; 
    int width;
    int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    
public Area(int length,int width){
    Scanner quaxly = new Scanner(System.in);
    this.length=length;
    this.width=width;
    this.result=result;
    System.out.println("Ingrese la base de su cuadrado: ");
    width = quaxly.nextInt();
    System.out.println("Ingrese el largo de su cuadrado: ");
    length = quaxly.nextInt();
    System.out.println(width * length);
}

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getArea(){
        return width * length;
    }
    
    
}
