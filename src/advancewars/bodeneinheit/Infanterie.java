package advancewars.bodeneinheit;

import advancewars.Einheit;
import advancewars.bodeneinheit.Bodeneinheit;
import advancewars.bodeneinheit.infanterie.Mech;
import com.sun.jdi.ClassType;

public class Infanterie extends Bodeneinheit {
    @Override
    public void angreifen(Einheit einheit) {
        double a;
        if (einheit instanceof Infanterie) a = 0.55;
        if (einheit instanceof Mech) a = 0.45;
    }
}
