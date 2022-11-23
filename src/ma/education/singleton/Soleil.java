package ma.education.singleton;

public class Soleil {
    private static Soleil instance;
    public double surface;
    private Soleil(double surface) {
        this.surface = surface;
    } //private constructor
    public static Soleil getInstance(double surface) {
        if (instance == null) {
                instance = new Soleil(surface);
        }
        return instance;
    }
}
