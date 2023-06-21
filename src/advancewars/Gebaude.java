package advancewars;

import advancewars.bodeneinheit.Bodeneinheit;
import advancewars.bodeneinheit.Infanterie;
import advancewars.bodeneinheit.infanterie.Mech;

public class Gebaude extends Feld {
    private int leben = 20;
    private Feld feld;

    public void erobern() {
        if (this.getEinheit() instanceof Einheit) {
            if (this.getEinheit() instanceof Infanterie || this.getEinheit() instanceof Mech) {
                if (this.feld == this.getEinheit().getFeld()) {
                    this.leben -= this.getEinheit().getHp();
                }
            }
        }
    }
    public void heilen() {
        if (this.getEinheit() instanceof Einheit) {
            if (this.getEinheit() instanceof Bodeneinheit) {
                if (this.getEinheit().getFeld() == this.feld) {
                    this.getEinheit().setHp(this.getEinheit().getHp() - 2);
                }
            }
        }
    }
}
