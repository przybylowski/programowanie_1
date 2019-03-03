public class P_1 {
    int liczba;

    public void TabliczkaMnozenia(int liczba) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i * liczba);
        }
    }

    public void ObliczanieParamKola(int promien) {
        double PoleKola;
        double ObwodKola;

        PoleKola = Math.PI * promien * promien;
        ObwodKola = Math.PI*2*promien;
        System.out.println("Pole kola = " + PoleKola +"\n"+ "Obwod kola = " + ObwodKola);
    }

    public void ParamProst (int bokA, int bokB) {
        int PoleProst = bokA*bokB;
        int ObwodProst = bokA*2 + bokB*2;
        System.out.println("Pole prostokąta = " + PoleProst +"\n"+ "Obwod prostokąta = " + ObwodProst);

    }

    public void PoleSzeciokata (int bokSz) {
        double PoleSz = (6 * (bokSz*bokSz))/(4*Math.tan(Math.PI/6));
        System.out.println("Pole sześciokąta = " + PoleSz );
    }
    public void ObliczanieSumyCyfr (int liczba) {
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int d = 0;
//        for (int i = 0; i < liczba; i++) {
//            a = liczba % 10;
//            b = liczba / 10;
//            c = b % 10;
//            d = b / 10;
//        }
//        int suma = a + c + d;
//        System.out.println("Suma liczb liczby " + liczba + " = " + suma);
        int wynik = 0;
        while (liczba != 0 ) {
            wynik += liczba%10;
            liczba /= 10;
        }
        System.out.println("Suma cyfr liczby  = " + wynik);
    }

    public void WygwiazdkowanieLinii (int dlugosc) {
        String s = "";
        for (int i = 0; i < dlugosc; i++) {
            s += "*";

        }

        System.out.println("Liczba gwiazdków = " + dlugosc + "\n" + "No to gwiazdkujemy:" + "\n" + s);
    }

    public void WygwiazdkowanieProstokata (int bokpA, int bokpB) {

        for (int i = 0; i < bokpA; i++) {
            for (int j = 0; j <bokpB; j++) {

                if ((i == 0) || (i == bokpA - 1)) {
                    System.out.print('*');
                }
                else if ((j == 0) || (j == bokpB -1 )) System.out.println('*');
                else System.out.print(' ');
            }
            System.out.println();
        }
    }

    public void Choinka (int wysokosc) {
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < (wysokosc - 1); j++) {
                if (i >= wysokosc - j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }



    public static void main(String[] args) {

        P_1 p_1 = new P_1();
        p_1.TabliczkaMnozenia(8);
        System.out.println("==================");
        p_1.ObliczanieParamKola(6);
        System.out.println("==================");
        p_1.ParamProst(6,8);
        System.out.println("==================");
        p_1.PoleSzeciokata(10);
        System.out.println("==================");
        p_1.ObliczanieSumyCyfr(44444);
        System.out.println("==================");
        p_1.WygwiazdkowanieLinii(50);
        System.out.println("==================");
        p_1.WygwiazdkowanieProstokata(10, 10);
        System.out.println("==================");
        p_1.Choinka(5);

    }
}
