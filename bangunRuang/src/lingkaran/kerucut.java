package lingkaran;

public class kerucut extends hitungLingkaran {
    public static double luas, volume, garislukis;
    private double tinggi;

    public kerucut (double jarijari, double tinggi) {
        super(jarijari);
        this.tinggi = tinggi;
    }
    public kerucut (int jarijari2, double tinggi){
        super(jarijari2);
        this.tinggi = tinggi;
    }
    public static double getVolume() {
        return volume;
    }

    public  double hitungGarisLukis(){
        garislukis = Math.sqrt(Math.pow(getJarijari(),2)+Math.pow(tinggi,2));
        return garislukis;
    }

    @Override
    public double menghitungLuas() {
        hitungGarisLukis();
        luas = Math.PI*getJarijari()*(getJarijari()+garislukis);
        return luas;
    }
    //Overloading
    public void hitungVolume(double jarijari){
        volume = Math.PI*Math.pow(getJarijari(),2)*tinggi/3;
    }
    public void hitungVolume(int jarijari2){
        volume = 22.0/7.0*Math.pow(getJarijari2(),2)*tinggi/3.0;
    }
}
