package prueba2_catalinayushan2;

import java.util.Scanner;

public class Volumen {
    int side_; //Vol square = s^3
    int lenght_;
    int width_;
    int height_;

    public int getSide_() {
        return side_;
    }

    public void setSide_(int side_) {
        this.side_ = side_;
    }

    public int getLenght_() {
        return lenght_;
    }

    public void setLenght_(int lenght_) {
        this.lenght_ = lenght_;
    }

    public int getWidth_() {
        return width_;
    }

    public void setWidth_(int width_) {
        this.width_ = width_;
    }

    public int getHeight_() {
        return height_;
    }

    public void setHeight_(int height_) {
        this.height_ = height_;
    }

    public Volumen(int side, int lenght, int width, int height) {
        Scanner quaxly = new Scanner(System.in);
        this.side_ = side;
        this.lenght_ = lenght;
        this.width_ = width;
        this.height_ = height;
        System.out.println("Ingrese la base de su cuadrado: ");
        width = quaxly.nextInt();
        System.out.println("Ingrese el largo de su cuadrado: ");
        length = quaxly.nextInt();
        System.out.println("Ingrese la altura de su cuadrado: ");
        height = quaxly.nextInt();
        System.out.println(largo * largo * largo);

    }
