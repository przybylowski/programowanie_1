package zadanie2;

public class TrebaczImpl extends AbstractMuzyk implements Trębacz {
    @Override
    public void gra() {
        System.out.println("Trąbkuje");
    }

    @Override
    String przedstawSie() {
        return getImie() + " " + getNazwisko();
    }

    public TrebaczImpl(String imie, String nazwisko) {
        setImie(imie);
        setNazwisko(nazwisko);
    }

}
