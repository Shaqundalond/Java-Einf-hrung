package Blatt1;

public class Aufgabe4 {
    public static void main(String[] args) {
        int spm = 60;
        int mph = 60;
        int hpd = 24;
        int dpy = 365;

        int input = 158036521;
        int full;

        System.out.println(input + " Sekunden entsprechen:");
        full = input/(spm*mph*hpd*dpy);
        System.out.println(full + "Jahren");
        input %= (spm*mph*hpd*dpy);

        full = input/(spm*mph*hpd);
        System.out.println(full + " Tagen");
        input %= (spm*mph*hpd);

        full = input/(spm*mph);
        System.out.println(full + " Stunden");
        input %= (spm*mph);

        full = input/(spm);
        System.out.println(full + " Minuten");
        input %= (spm);

        full = input;
        System.out.println(full + " Sekunden");


    }
}
