package Zadanie_4_1_1;

import java.util.Objects;

public class Square extends Shape{
    double bok;
    Wspolrzedne wspolrzedne;

    public Square(double bok, int x, int y) {
        this.bok = bok;
        this.wspolrzedne = new Wspolrzedne(x,y);
    }

    @Override
    double getArea() {

        return bok*bok;
    }

    @Override
    double getPerimeter() {
        return 4*bok;
    }

    @Override
    Wspolrzedne getPosition() {
        return wspolrzedne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return bok == square.bok &&
                wspolrzedne.equals(square.wspolrzedne);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bok, wspolrzedne);
    }

    @Override
    public void resize(double wspolczynnikPowiekszenia) {
        bok = bok*wspolczynnikPowiekszenia;
    }


}
