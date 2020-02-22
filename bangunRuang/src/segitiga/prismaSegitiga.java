package segitiga;

public class prismaSegitiga extends hitungSegitiga{
    public static double volume;
    private double tinggi;

    public prismaSegitiga(double sisi,double tinggi){
        super(sisi);
        this.tinggi = tinggi;
    }
    public prismaSegitiga(int sisi2, double tinggi){
        super(sisi2);
        this.tinggi = tinggi;
    }
    public static double getVolume() {
        return volume;
    }

    public void hitungVolume(double sisi){
        volume = getSisi()*hitungSegitiga.tinggi/2.0*tinggi;
    }
    public void hitungVolume(int sisi2){
        volume = getSisi()*hitungSegitiga.tinggi/2.0*tinggi;
    }

    @Override
    public double menghitungLuas() {
        luas = 2*getSisi()*hitungSegitiga.tinggi/2.0+3*getSisi()*tinggi;
        return luas;
    }
}
