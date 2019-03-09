package Zadanie_4_1_1;

public abstract class Shape implements Movable,Resizable{
    abstract double getArea();
    abstract double getPerimeter();
    abstract Wspolrzedne getPosition();

    void wypiszDane() {
        System.out.println("==================");
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Pole: " + getArea());
        System.out.println("Obwod: " + getPerimeter());
        System.out.println("Wspolrzedne: " + getPosition());

    }
    void wypiszDanePoZmianie() {
        System.out.println("==================");
        System.out.println(this.getClass().getSimpleName() + " zmieniony");
        System.out.println("Pole: " + getArea());
        System.out.println("Obwod: " + getPerimeter());
        System.out.println("Wspolrzedne: " + getPosition());

    }
    @Override
    public void moveLeft(int turnLeftModificator) {
        getPosition().setWspolrzedna_x(getPosition().wspolrzedna_x + turnLeftModificator);
    }

    @Override
    public void moveRight(int turnRightModificator) {
        getPosition().setWspolrzedna_x(getPosition().wspolrzedna_x - turnRightModificator);
    }

    @Override
    public void moveUp(int moveUpModificator) {
        getPosition().setWspolrzedna_y(getPosition().wspolrzedna_y - moveUpModificator);
    }

    @Override
    public void moveDown(int moveDownModificator) {
        getPosition().setWspolrzedna_y(getPosition().wspolrzedna_y - moveDownModificator);
    }

}
