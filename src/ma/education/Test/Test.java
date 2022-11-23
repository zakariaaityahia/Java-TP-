package ma.education.Test;

import ma.education.singleton.Soleil;

public class Test {
    public static void main(String[] args) {

        Soleil S1 = Soleil.getInstance(1000.5);
        Soleil S2 = Soleil.getInstance(2000.5);
        System.out.println(S1.surface);
        System.out.println(S2.surface);
    }
}
