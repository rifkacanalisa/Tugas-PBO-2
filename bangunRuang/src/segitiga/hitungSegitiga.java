package segitiga;

public class hitungSegitiga {
    private double sisi, alas, tinggiSegitiga, sisiMiring;
    private int sisi2;
    public static double luas, tinggi, keliling, luas2;

    public hitungSegitiga(double sisi) {
        this.sisi = sisi;
    }
    public hitungSegitiga(int sisi2){ this.sisi2 = sisi2; }
    public hitungSegitiga(double alas, double tinggiSegitiga){
        this.alas = alas;
        this.tinggiSegitiga = tinggiSegitiga;
    }
    public double getSisi() { return this.sisi; }
    public int getSisi2() { return sisi2; }

    public static double getKeliling() { return keliling; }

    public double menghitungTinggi() {
        tinggi = Math.sqrt(Math.pow(sisi,2) - Math.pow(sisi/2,2));
        return tinggi;
    }
    public double menghitungLuas(){
        menghitungTinggi();
        luas = sisi*tinggi/2;
        return this.luas;
    }
    public double manghitungLuasSiku(){
        luas2 = alas*tinggiSegitiga/2;
        return luas2;
    }

    public void hitungKeliling(double sisi){
        keliling = 3*sisi;
    }
    public void hitungKeliling(double alas, double tinggiSegitiga){
        sisiMiring = Math.sqrt(Math.pow(alas,2) + Math.pow(tinggiSegitiga,2));
        keliling = alas + tinggiSegitiga + sisiMiring;
    }

}
