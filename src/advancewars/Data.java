package advancewars;

public class Data {

    /**
     *
     * @param e1 Angreifende Einheit
     * @param e2 Verteidigende Einheit
     * @return Schadenswert (-1, falls kein Angriff möglich)
     */
    public static double table(Einheit e1, Einheit e2) {

        String name1 = e1.getClass().getSimpleName();
        String name2 = e2.getClass().getSimpleName();

        if (name1.equals("Infanterie")) {
            switch(name2) {
                case "Infanterie":
                    return 0.55;
                case "Mech":
                    return 0.45;
                case "Spaeher":
                    return 0.12;
                case "LPanzer":
                    return 0.05;
                case "KPanzer":
                    return 0.01;
                case "NeoPanzer":
                    return 0.01;
                case "Transporter":
                    return 0.14;
                case "Flak":
                    return 0.05;
                case "LAbwehr":
                    return 0.26;
                case "Artillerie":
                    return 0.15;
                case "Raketenwerfer":
                    return 0.25;
                case "KHeli":
                    return 0.07;
                case "THeli":
                    return 0.30;
            }
        } else if (name1.equals("Mech")) {
            switch(name2) {
                case "Infanterie":
                    return 0.65;
                case "Mech":
                    return 0.55;
                case "Spaeher":
                    return 0.85;
                case "LPanzer":
                    return 0.55;
                case "KPanzer":
                    return 0.15;
                case "NeoPanzer":
                    return 0.15;
                case "Transporter":
                    return 0.75;
                case "Flak":
                    return 0.65;
                case "LAbwehr":
                    return 0.85;
                case "Artillerie":
                    return 0.70;
                case "Raketenwerfer":
                    return 0.85;
                case "KHeli":
                    return 0.09;
                case "THeli":
                    return 0.35;
            }
        } else if (name1.equals("Spaeher")) {
            switch(name2) {
                case "Infanterie":
                    return 0.70;
                case "Mech":
                    return 0.65;
                case "Spaeher":
                    return 0.35;
                case "LPanzer":
                    return 0.06;
                case "KPanzer":
                    return 0.01;
                case "NeoPanzer":
                    return 0.01;
                case "Transporter":
                    return 0.45;
                case "Flak":
                    return 0.04;
                case "LAbwehr":
                    return 0.28;
                case "Artillerie":
                    return 0.45;
                case "Raketenwerfer":
                    return 0.55;
                case "KHeli":
                    return 0.10;
                case "THeli":
                    return 0.35;
            }
        } else if (name1.equals("LPanzer")) {
            switch(name2) {
                case "Infanterie":
                    return 0.75;
                case "Mech":
                    return 0.70;
                case "Spaeher":
                    return 0.85;
                case "LPanzer":
                    return 0.55;
                case "KPanzer":
                    return 0.15;
                case "NeoPanzer":
                    return 0.15;
                case "Transporter":
                    return 0.75;
                case "Flak":
                    return 0.65;
                case "LAbwehr":
                    return 0.85;
                case "Artillerie":
                    return 0.70;
                case "Raketenwerfer":
                    return 0.85;
                case "KHeli":
                    return 0.09;
                case "THeli":
                    return 0.35;
                case "Kampfschiff":
                    return 0.01;
                case "Kreuzer":
                    return 0.05;
                case "LBoot":
                    return 0.10;
                case "UBoot":
                    return 0.01;
            }
        } else if (name1.equals("KPanzer")) {
            switch(name2) {
                case "Infanterie":
                    return 1.05;
                case "Mech":
                    return 0.95;
                case "Spaeher":
                    return 1.05;
                case "LPanzer":
                    return 0.75;
                case "KPanzer":
                    return 0.55;
                case "NeoPanzer":
                    return 0.45;
                case "Transporter":
                    return 1.05;
                case "Flak":
                    return 1.05;
                case "LAbwehr":
                    return 1.05;
                case "Artillerie":
                    return 1.05;
                case "Raketenwerfer":
                    return 1.05;
                case "KHeli":
                    return 0.12;
                case "THeli":
                    return 0.45;
                case "Kampfschiff":
                    return 0.10;
                case "Kreuzer":
                    return 0.55;
                case "LBoot":
                    return 0.35;
                case "UBoot":
                    return 0.10;
            }
        } else if (name1.equals("NeoPanzer")) {
            switch(name2) {
                case "Infanterie":
                    return 1.25;
                case "Mech":
                    return 1.15;
                case "Spaeher":
                    return 1.25;
                case "LPanzer":
                    return 1.05;
                case "KPanzer":
                    return 0.75;
                case "NeoPanzer":
                    return 0.55;
                case "Transporter":
                    return 1.25;
                case "Flak":
                    return 1.15;
                case "LAbwehr":
                    return 1.25;
                case "Artillerie":
                    return 1.15;
                case "Raketenwerfer":
                    return 1.25;
                case "KHeli":
                    return 0.22;
                case "THeli":
                    return 0.55;
                case "Kampfschiff":
                    return 0.10;
                case "Kreuzer":
                    return 0.50;
                case "LBoot":
                    return 0.40;
                case "UBoot":
                    return 0.15;
            }
        } else if (name1.equals("Flak")) {
            switch(name2) {
                case "Infanterie":
                    return 1.05;
                case "Mech":
                    return 1.05;
                case "Spaeher":
                    return 0.60;
                case "LPanzer":
                    return 0.25;
                case "KPanzer":
                    return 0.10;
                case "NeoPanzer":
                    return 0.05;
                case "Transporter":
                    return 0.50;
                case "Flak":
                    return 0.45;
                case "LAbwehr":
                    return 0.55;
                case "Artillerie":
                    return 0.50;
                case "Raketenwerfer":
                    return 0.45;
                case "KHeli":
                    return 1.20;
                case "THeli":
                    return 1.20;
                case "Jäger":
                    return 0.65;
                case "Bomber":
                    return 0.75;
            }
        } else if (name1.equals("LAbwehr")) {
            switch(name2) {
                case "KHeli":
                    return 1.20;
                case "THeli":
                    return 1.20;
                case "Jäger":
                    return 1.00;
                case "Bomber":
                    return 1.00;

            }
        } else if (name1.equals("Artillerie")) {
            switch(name2) {
                case "Infanterie":
                    return 0.90;
                case "Mech":
                    return 0.85;
                case "Spaeher":
                    return 0.80;
                case "LPanzer":
                    return 0.70;
                case "KPanzer":
                    return 0.45;
                case "NeoPanzer":
                    return 0.40;
                case "Transporter":
                    return 0.70;
                case "Flak":
                    return 0.75;
                case "LAbwehr":
                    return 0.80;
                case "Artillerie":
                    return 0.75;
                case "Raketenwerfer":
                    return 0.80;
                case "Kampfschiff":
                    return 0.40;
                case "Kreuzer":
                    return 0.65;
                case "LBoot":
                    return 0.55;
                case "UBoot":
                    return 0.60;
            }
        } else if (name1.equals("Raketenwerfer")) {
            switch(name2) {
                case "Infanterie":
                    return 0.95;
                case "Mech":
                    return 0.90;
                case "Spaeher":
                    return 0.90;
                case "LPanzer":
                    return 0.85;
                case "KPanzer":
                    return 0.55;
                case "NeoPanzer":
                    return 0.50;
                case "Transporter":
                    return 0.80;
                case "Flak":
                    return 0.85;
                case "LAbwehr":
                    return 0.90;
                case "Artillerie":
                    return 0.80;
                case "Raketenwerfer":
                    return 0.85;
                case "Kampfschiff":
                    return 0.55;
                case "Kreuzer":
                    return 0.85;
                case "LBoot":
                    return 0.60;
                case "UBoot":
                    return 0.85;
            }
        } else if (name1.equals("Jäger")) {
            switch(name2) {
                case "KHeli":
                    return 1.00;
                case "THeli":
                    return 1.00;
                case "Jäger":
                    return 0.65;
                case "Bomber":
                    return 1.00;

            }
        } else if (name1.equals("Bomber")) {
            switch(name2) {
                case "Infanterie":
                    return 1.10;
                case "Mech":
                    return 1.10;
                case "Spaeher":
                    return 1.05;
                case "LPanzer":
                    return 1.05;
                case "KPanzer":
                    return 0.95;
                case "NeoPanzer":
                    return 0.90;
                case "Transporter":
                    return 1.05;
                case "Flak":
                    return 0.95;
                case "LAbwehr":
                    return 1.05;
                case "Artillerie":
                    return 1.05;
                case "Raketenwerfer":
                    return 1.05;
                case "Kampfschiff":
                    return 0.75;
                case "Kreuzer":
                    return 0.85;
                case "LBoot":
                    return 0.95;
                case "UBoot":
                    return 0.95;
            }
        } else if (name1.equals("KHeli")) {
            switch(name2) {
                case "Infanterie":
                    return 0.75;
                case "Mech":
                    return 0.75;
                case "Spaeher":
                    return 0.55;
                case "LPanzer":
                    return 0.55;
                case "KPanzer":
                    return 0.25;
                case "NeoPanzer":
                    return 0.20;
                case "Transporter":
                    return 0.60;
                case "Flak":
                    return 0.25;
                case "LAbwehr":
                    return 0.65;
                case "Artillerie":
                    return 0.65;
                case "Raketenwerfer":
                    return 0.65;
                case "KHeli":
                    return 0.65;
                case "THeli":
                    return 0.95;
                case "Kampfschiff":
                    return 0.25;
                case "Kreuzer":
                    return 0.55;
                case "LBoot":
                    return 0.25;
                case "UBoot":
                    return 0.25;
            }
        } else if (name1.equals("Kampfschiff")) {
            switch(name2) {
                case "Infanterie":
                    return 0.95;
                case "Mech":
                    return 0.90;
                case "Spaeher":
                    return 0.90;
                case "LPanzer":
                    return 0.85;
                case "KPanzer":
                    return 0.55;
                case "NeoPanzer":
                    return 0.50;
                case "Transporter":
                    return 0.80;
                case "Flak":
                    return 0.85;
                case "LAbwehr":
                    return 0.90;
                case "Artillerie":
                    return 0.80;
                case "Raketenwerfer":
                    return 0.85;
                case "Kampfschiff":
                    return 0.50;
                case "Kreuzer":
                    return 0.95;
                case "LBoot":
                    return 0.95;
                case "UBoot":
                    return 0.95;
            }
        } else if (name1.equals("Kreuzer")) {
            switch(name2) {
                case "KHeli":
                    return 1.15;
                case "THeli":
                    return 1.15;
                case "Jäger":
                    return 0.55;
                case "Bomber":
                    return 0.65;
                case "UBoot":
                    return 0.90;
            }
        } else if (name1.equals("UBoot")) {
            switch(name2) {
                case "Kampfschiff":
                    return 0.55;
                case "Kreuzer":
                    return 0.25;
                case "LBoot":
                    return 0.95;
                case "UBoot":
                    return 0.55;

            }
        }

        return -1;
    }
}
