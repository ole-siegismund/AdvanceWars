package advancewars;

import advancewars.bodeneinheit.Infanterie;
import advancewars.bodeneinheit.ketten.panzer.LPanzer;

public class Test {
    public static void main(String[] args) {
        LPanzer lPanzer = new LPanzer();
        Infanterie infanterie = new Infanterie();

        System.out.println(lPanzer.getHp());
        System.out.println(infanterie.getHp());

        lPanzer.angreifen(infanterie);

        System.out.println(infanterie.getHp());
    }
}
