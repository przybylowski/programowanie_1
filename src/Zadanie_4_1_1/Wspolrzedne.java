package Zadanie_4_1_1;

public class Wspolrzedne{
    int wspolrzedna_x;
    int wspolrzedna_y;

    public Wspolrzedne(int wspolrzedna_x, int wspolrzedna_y) {
        this.wspolrzedna_x = wspolrzedna_x;
        this.wspolrzedna_y = wspolrzedna_y;
    }

    public int getWspolrzedna_x() {
        return wspolrzedna_x;
    }

    public int getWspolrzedna_y() {
        return wspolrzedna_y;
    }

    public void setWspolrzedna_x(int wspolrzedna_x) {
        this.wspolrzedna_x = wspolrzedna_x;
    }

    public void setWspolrzedna_y(int wspolrzedna_y) {
        this.wspolrzedna_y = wspolrzedna_y;
    }

    @Override
    public String toString() {
        return "Wspolrzedne figury{" +
                "wspolrzedna x=" + wspolrzedna_x +
                ", wspolrzedna y=" + wspolrzedna_y +
                '}';
    }


}
