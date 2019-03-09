package Zadanie_4_1_1;

public abstract class Shape{
    abstract double getArea();
    abstract double getPerimeter();
    abstract Wspolrzedne getPosition();

    void wypiszDane() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Pole: " + getArea());
        System.out.println("Obwod: " + getPerimeter());
        System.out.println("Wspolrzedne: " + getPosition());

    }


}
