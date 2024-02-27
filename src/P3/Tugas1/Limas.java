package P3.Tugas1;

public class Limas {
    public double a, t;

    Limas(double a, double t) {
        this.a = a;
        this.t = t;
    }
    
    double luasPermukaan() {
        return a * a + 4 * (0.5 * a *t);
    }
    
    double volume() {
        return (1.0/3.0) * a * a * t;
    }
}
