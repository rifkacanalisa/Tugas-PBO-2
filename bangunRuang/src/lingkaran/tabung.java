package lingkaran;

public class tabung extends hitungLingkaran {
    public static double luas, volume;
    private double tinggi;

    public tabung (double jarijari, double tinggi){
        super(jarijari);
        this.tinggi = tinggi;
    }
    public tabung (int jarijari2, double tinggi){
        super(jarijari2);
        this.tinggi = tinggi;
    }
    public static double getVolume() {
        return volume;
    }

    //OVERLOADING
    public void hitungVolume(double jarijari){
        volume = Math.PI*Math.pow(getJarijari(),2)*tinggi;
    }
    public void hitungVolume(int jarijari2){
        volume = 22.0/7.0*Math.pow(getJarijari2(),2)*tinggi;
    }

    @Override
    public double menghitungLuas() {
        luas = 2*Math.PI*getJarijari()*(getJarijari() + tinggi);
        return luas;
    }
}
