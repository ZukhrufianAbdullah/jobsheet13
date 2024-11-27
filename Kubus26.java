package Pertemuan13;

import java.util.Scanner;

public class Kubus26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, lp, vol;

        System.out.println("=== MENGHITUNG LUAS PERMUKAAN DAN VOLUME KUBUS ===");
        System.out.print("Masukkan sisi kubus: ");
        s = sc.nextInt();

        lp = hitungLuasPermukaan(s);
        vol = hitungVolume(s);
        System.out.println("Luas permukaan kubus = " + lp);
        System.out.println("Volume kubus = " + vol);

        sc.close();
    }
    //Fungsi luas permukaan kubus
    public static int hitungLuasPermukaan(int s){
        int luasPermukaan = 6 * s * s;
        return luasPermukaan;
    }
    //Fungsi volume kubus
    public static int hitungVolume(int s){
        int volume = s * s * s;
        return volume;
    }
}