package P3.Tugas1;

public class Kerucut {
    public  double r, s;

    Kerucut(double r, double s) {
        this.r = r;
        this.s = s;
    }

    double luasPermukaan() {
        return 3.14 * r * (r + s);
    }

    double volume() {
        return (1.0/3.0) * 3.14 * r * r * s;
    }
}
