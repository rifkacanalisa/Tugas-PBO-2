import segitiga.*;
import lingkaran.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilihMenu, jarijari2, sisi2;
        char kembali;
        double sisi, tinggi, jarijari, alas, tinggiSegitiga, tinggiSisi;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Menghitung Luas serta Volume Bangun Ruang");
            System.out.println("Pilih Bangun Ruang : ");
            System.out.println("1. Segitiga : ");
            System.out.println("    a. Limas Segitiga");
            System.out.println("    b. Prisma Segitiga");
            System.out.println("2. Lingkaran : ");
            System.out.println("    a. Bola");
            System.out.println("    b. Kerucut");
            System.out.println("    c. Tabung");
            System.out.print("Menu yang dipilih : ");
            pilihMenu = input.nextInt();
            System.out.println();
            System.out.println("    MENGHITUNG BANGUN 2D");
            System.out.println();
            if (pilihMenu==1){
                System.out.print(" Sisi = ");
                sisi = input.nextDouble();
                sisi2 = (int) sisi;
                System.out.print(" Alas = ");
                alas = input.nextDouble();
                System.out.print(" Tinggi = ");
                tinggiSegitiga = input.nextDouble();

                System.out.println("    SEGITIGA SAMA SISI");
                hitungSegitiga segitigaSisi = new hitungSegitiga(sisi);
                segitigaSisi.hitungKeliling(sisi);
                System.out.println(" Keliling Segitiga = " + hitungSegitiga.getKeliling());
                System.out.println(" Luas Segitiga = " + segitigaSisi.menghitungLuas());
                System.out.println();

                System.out.println("    SEGITIGA SIKU-SIKU");
                hitungSegitiga segitigaKaki = new hitungSegitiga(alas, tinggiSegitiga);
                segitigaKaki.hitungKeliling(alas, tinggiSegitiga);
                System.out.println(" Keliling Segitiga = " + hitungSegitiga.getKeliling());
                System.out.println(" Luas Segitiga = " + segitigaKaki.manghitungLuasSiku());
                System.out.println();

                System.out.println("    MENGHITUNG BANGUN 3D (SEGITIGA SAMA SISI)");
                System.out.print(" Tinggi = ");
                tinggi = input.nextDouble();
                System.out.println();

                tinggiSisi = hitungSegitiga.tinggi;
                limasSegitiga limas = new limasSegitiga(sisi, tinggi);
                System.out.println("    LIMAS SEGITIGA");
                System.out.println(" Luas Permukaan = " + limas.menghitungLuas());
                if(sisi*tinggiSisi%6==0){
                    limasSegitiga limas2 = new limasSegitiga(sisi2, tinggi);
                    limas2.hitungVolume(sisi2);
                }
                else{
                    limas.hitungVolume(sisi);
                }
                System.out.println(" Volume = " + limasSegitiga.getVolume());
                System.out.println();

                prismaSegitiga prisma = new prismaSegitiga(sisi, tinggi);
                System.out.println("    PRISMA SEGITIGA");
                System.out.println(" Luas Permukaan = " + prisma.menghitungLuas());
                if (sisi*tinggiSisi%2==0){
                    System.out.println(hitungSegitiga.luas);
                    prismaSegitiga prisma2 = new prismaSegitiga(sisi2, tinggi);
                    prisma2.hitungVolume(sisi2);
                }
                else{
                    prisma.hitungVolume(sisi);
                }
                System.out.println(" Volume = " + prismaSegitiga.getVolume());
            }

            else if (pilihMenu == 2){
                System.out.println("    LINGKARAN");
                System.out.print(" Jari-jari = ");
                jarijari = input.nextDouble();
                jarijari2 = (int) jarijari;
                hitungLingkaran lingkaran = new hitungLingkaran(jarijari);
                if(jarijari%7!=0){
                    lingkaran.hitungKeliling(jarijari);
                }
                else{
                    hitungLingkaran lingkaran2 = new hitungLingkaran(jarijari2);
                    lingkaran2.hitungKeliling(jarijari2);
                }
                System.out.println(" Keliling Lingkaran = " + hitungLingkaran.getKeliling());
                System.out.println(" Luas Lingkaran = " + lingkaran.menghitungLuas());
                System.out.println();

                System.out.println("    MENGHITUNG BANGUN 3D");
                System.out.print(" Tinggi = ");
                tinggi = input.nextDouble();
                System.out.println();
                bola bolanya = new bola(jarijari);
                System.out.println("    BOLA");
                System.out.println(" Luas Permukaan = " + bolanya.menghitungLuas());
                if(jarijari%21 == 0){
                    bola bolanya2 = new bola(jarijari2);
                    bolanya2.hitungVolume(jarijari2);
                    System.out.println(" Volume = " + bola.getVolume());
                }
                else{
                    bolanya.hitungVolume(jarijari);
                    System.out.println(" Volume = " + bola.getVolume());
                }
                System.out.println();

                kerucut kerucutnya = new kerucut(jarijari, tinggi);
                System.out.println("    KERUCUT");
                System.out.println(" Luas Permukaan = " + kerucutnya.menghitungLuas());
                if(jarijari*tinggi%21==0){
                    kerucut kerucutnya2 = new kerucut(jarijari2,tinggi);
                    kerucutnya2.hitungVolume(jarijari2);
                }
                else{
                    kerucutnya.hitungVolume(jarijari);
                }
                System.out.println(" Volume = " + kerucut.getVolume());
                System.out.println();

                tabung tabungnya = new tabung(jarijari, tinggi);
                System.out.println("    TABUNG");
                System.out.println(" Luas Permukaan = " + tabungnya.menghitungLuas());
                if(jarijari*tinggi%7==0){
                    tabung tabungnya2 = new tabung(jarijari2, tinggi);
                    tabungnya2.hitungVolume(jarijari2);
                }
                else{
                    tabungnya.hitungVolume(jarijari);
                }
                System.out.println(" Volume = " + tabung.getVolume());
            }
            System.out.println();
            System.out.print("Kembali ? (y/n) ");
            kembali = input.next().charAt(0);
        } while(kembali=='y' || kembali=='Y');
    }
}
