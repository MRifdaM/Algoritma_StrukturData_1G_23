package P3.Tugas1;

public class Bola {
    public double r;

    Bola(double r) {
        this.r = r;
    }
    
    
    double luasPermukaan() {
        
        return 4 * 3.14 * r * r;
    }
    
    
    double volume() {
        
        return (4.0/3.0) * 3.14 * r * r * r;
    }
}
