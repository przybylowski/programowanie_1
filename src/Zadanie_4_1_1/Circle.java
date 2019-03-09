package Zadanie_4_1_1;

import java.util.Objects;

public class Circle extends Shape {
    int promien;
    Wspolrzedne wspolrzedne;

    public Circle(int promien, int x, int y) {
        this.promien = promien;
        this.wspolrzedne = new Wspolrzedne(x,y);
    }

    @Override
    double getArea() {
        return Math.PI*promien*promien;
    }

    @Override
    double getPerimeter() {
        return Math.PI*2*promien;
    }

    @Override
    Wspolrzedne getPosition() {
        return wspolrzedne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return promien == circle.promien &&
                wspolrzedne.equals(circle.wspolrzedne);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promien, wspolrzedne);
    }


}
