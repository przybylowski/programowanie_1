package Zadanie_4_1_1;
import java.util.HashSet;
import  java.util.Set;
public class Shapes {
    public static void main(String[] args) {
    Square kwadrat = new Square(4,5,10);
    Square kwadra2t = new Square(4,5,10);
    Circle kolo = new Circle(6, 10, 5);
    Rectangle prostokat = new Rectangle(20, 10, 3, 1);
    Triangle trojkat = new Triangle(5,5,5,4,19,15);

    Set<Shape> figury = new HashSet<>();
    figury.add(kwadrat);
    figury.add(kwadra2t);
    figury.add(kolo);
    figury.add(prostokat);
    figury.add(trojkat);

    figury.forEach(Shape::wypiszDane);
    }
}
