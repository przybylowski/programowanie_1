package zadanie2;

public class PianistaImpl extends AbstractMuzyk implements Pianista {
    @Override
    public void gra() {
        System.out.println("gra na pianinie");
    }
    @Override
    String przedstawSie() {
        return getImie() + " " + getNazwisko();
    }

    public PianistaImpl(String imie, String nazwisko) {
        setImie(imie);
        setNazwisko(nazwisko);
    }
}
