package lingkaran;

public class hitungLingkaran {
    private double jarijari;
    private int jarijari2;
    public static double luas, keliling;

    public hitungLingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public hitungLingkaran(int jarijari2){ this.jarijari2 = jarijari2; }
    public double getJarijari() {
        return this.jarijari;
    }
    public int getJarijari2() { return this.jarijari2; }
    public static double getKeliling() { return keliling; }

    public double menghitungLuas(){
        luas = jarijari*Math.PI*jarijari;
        return this.luas;
    }

    public void hitungKeliling(double jarijari){
        keliling = 2*Math.PI*jarijari;
    }
    public void hitungKeliling(int jarijari){
        keliling = 2*22/7*jarijari;
    }
}
