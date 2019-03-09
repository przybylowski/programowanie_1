package Zadanie_4_1_1;

import java.util.Objects;

public class Triangle extends Shape{
    int wysokosc;
    int bokA;
    int bokB;
    int bokC;
    Wspolrzedne wspolrzedne;

    public Triangle(int wysokosc, int bokA, int bokB, int bokC, int x, int y) {
        this.wysokosc = wysokosc;
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.wspolrzedne = new Wspolrzedne(x,y);
    }

    @Override
    double getArea() {
        return 0.5*wysokosc*bokA;
    }

    @Override
    double getPerimeter() {
        return bokA+bokB+bokC;
    }

    @Override
    Wspolrzedne getPosition() {
        return wspolrzedne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return wysokosc == triangle.wysokosc &&
                bokA == triangle.bokA &&
                bokB == triangle.bokB &&
                bokC == triangle.bokC &&
                wspolrzedne.equals(triangle.wspolrzedne);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wysokosc, bokA, bokB, bokC, wspolrzedne);
    }
}
