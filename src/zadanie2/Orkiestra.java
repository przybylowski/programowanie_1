package zadanie2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Orkiestra {

    ArrayList<Muzyk> muzycy = new ArrayList<>();


    public void dodaj(Muzyk muzyk) {
        muzycy.add(muzyk);
    }

    public static void main(String[] args) throws InterruptedException {

        Orkiestra orkiestra = new Orkiestra();
        SkrzypekImpl skrzypek1 = new SkrzypekImpl("Tomasz", "Co Masz");
        SkrzypekImpl skrzypek2 = new SkrzypekImpl("Krzyś", "Ryś");
        PianistaImpl pianista1 = new PianistaImpl("Jacek", "Placek");
        PianistaImpl pianista2 = new PianistaImpl("Ala", "Ma Kota");
        TrebaczImpl trebacz1 = new TrebaczImpl("Wielbłąd", "Karol");
        TrebaczImpl trebacz2 = new TrebaczImpl("Testowy", "Muzyk");

        orkiestra.dodaj(skrzypek1);
        orkiestra.dodaj(skrzypek2);
        orkiestra.dodaj(pianista1);
        orkiestra.dodaj(pianista2);
        orkiestra.dodaj(trebacz1);
        orkiestra.dodaj(trebacz2);

        List<Muzyk> muzycy = Arrays.asList(skrzypek1, skrzypek1, pianista1, pianista2, trebacz1, trebacz2);
        System.out.println("Popuś graj" + "\n");
        muzycy.forEach(Muzyk::gra);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Koniec gry" + "\n" + "\n" + "Wystąpili:");
        System.out.println(skrzypek1.przedstawSie());
        System.out.println(skrzypek2.przedstawSie());
        System.out.println(pianista1.przedstawSie());
        System.out.println(pianista2.przedstawSie());
        System.out.println(trebacz1.przedstawSie());
        System.out.println(trebacz2.przedstawSie());
        
    }
}

