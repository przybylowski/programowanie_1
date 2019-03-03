package zadanie2;

public class SkrzypekImpl extends  AbstractMuzyk implements Skrzypek {

    @Override
    public void gra() {
        System.out.println("Skrzypkuje");
    }
    @Override
    String przedstawSie() {
        return getImie() + " " + getNazwisko();
    }

    public SkrzypekImpl(String imie, String nazwisko) {
        setImie(imie);
        setNazwisko(nazwisko);
    }
}
