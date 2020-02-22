package segitiga;

public class limasSegitiga extends hitungSegitiga {
    public static double volume, tinggiSelimut;
    private double tinggi;

    public limasSegitiga(double sisi,double tinggi){
        super(sisi);
        this.tinggi = tinggi;
    }
    public limasSegitiga(int sisi2, double tinggi){
        super(sisi2);
        this.tinggi = tinggi;
    }
    public static double getVolume() {
        return volume;
    }

    public void hitungVolume(double sisi){
        volume = getSisi()*hitungSegitiga.tinggi/2.0*tinggi/3;
    }
    public void hitungVolume(int sisi2){
        volume = getSisi()*hitungSegitiga.tinggi/2.0*tinggi/3;
    }

    public double hitungTinggiSelimut(){
        tinggiSelimut = Math.sqrt(Math.pow(hitungSegitiga.tinggi/2,2)+Math.pow(tinggi,2));
        return tinggiSelimut;
    }

    @Override
    public double menghitungLuas() {
        hitungTinggiSelimut();
        luas = getSisi()*hitungSegitiga.tinggi/2.0+3*super.getSisi()*tinggiSelimut/2.0;
        return luas;
    }

}
