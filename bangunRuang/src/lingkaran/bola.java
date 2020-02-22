package lingkaran;

public class bola extends hitungLingkaran {
    public static double luas, volume;

    public bola (double jarijari){
        super(jarijari);
    }
    public bola (int jarijari2){ super(jarijari2);}
    public static double getVolume() { return volume; }

    public void hitungVolume(double jarijari){
        volume = 4.0/3.0*Math.PI*Math.pow(getJarijari(),3);
    }
    public void hitungVolume(int jarijari2){
        volume = 4.0/3.0*22.0/7.0*Math.pow(getJarijari2(),3);
    }

    @Override
    public double menghitungLuas() {
        luas = 4*hitungLingkaran.luas;
        return luas;
    }
}
