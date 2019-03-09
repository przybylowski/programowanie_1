package Zadanie_4_1_1;

public class Rectangle extends Shape{
    double bokA;
    double bokB;
    Wspolrzedne wspolrzedne;

    public Rectangle(double bokA, double bokB, int x, int y) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.wspolrzedne = new Wspolrzedne(x, y);
    }

    @Override
    double getArea() {
        return bokA*bokB;
    }

    @Override
    double getPerimeter() {
        return 2 * bokA + 2 * bokB;
    }

    @Override
    Wspolrzedne getPosition() {
        return wspolrzedne;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void resize(double wspolczynnikPowiekszenia) {
        bokA = bokA*wspolczynnikPowiekszenia;
        bokB = bokB*wspolczynnikPowiekszenia;
    }

}
