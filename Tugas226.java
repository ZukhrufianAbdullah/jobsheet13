package Pertemuan13;

import java.util.Scanner;

public class Tugas226 {
    public static void main(String[] args) {
        System.out.println("===== KAFE BU MARIANA =====");

        String[] menu = {"Kopi", "Teh" , "Es degan", "Roti Bakar" ,"Gorengan"};
        int[] hari = {1, 2, 3, 4, 5, 6, 7};
        int[][] dataPenjualan = new int[menu.length][hari.length];

        inputData(dataPenjualan, menu, hari);
        System.out.println("Tabel data penjualan");
        tampilkanData(dataPenjualan, menu, hari);
        int indeks = menuTertinggi(dataPenjualan, menu, hari);
        System.out.println("\nMenu dengan penjualan tertinggi = " + menu[indeks]);
        rataRataMenu(dataPenjualan, menu, hari);
    }
    //Fungsi menginputkan data penjualan
    public static void inputData(int[][] data, String[] menu, int[] hari){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < data.length; i++){
            System.out.println("Masukkan data penjualan " + menu[i]);
            for (int j = 0; j < data[i].length; j++){
                System.out.print("Hari ke-" + (j+1) + ": ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
    }
    //Fungsi menampilkan data penjualan
    public static void tampilkanData(int[][] data, String[] menu, int[] hari){
        //Menampilkan hari
        for (int i = 0; i < hari.length; i++){
            if (i == 0) {
                System.out.print("Hari\t\t" + hari[i]);
            }else{
                System.out.print("\t" + hari[i]);
            }
        }
        System.out.println("\n--------------------------------------------------------------------------");
        //Menampilkan menu
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                if (j == 0 && (i != 0 && i != 1)) {
                    System.out.print(menu[i] + "\t" + data[i][j]);
                }else if (j == 0 && (i == 0 || i == 1)) {
                    System.out.print(menu[i] + "\t\t" + data[i][j]);
                }else{
                    System.out.print("\t" + data[i][j]);
                }
            }
            System.out.println();
        }
    }
    //Fungsi menampilkan menu dengan penjualan tertinggi
    public static int menuTertinggi(int[][] data, String[] menu, int[] hari){
        int[] total = new int[menu.length];
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                total[i] += data[i][j];
            }
        }

        int nilaiMaks = total[0];
        int indeks = 0;

        for (int i = 1; i < total.length; i++){
            if (total[i] > nilaiMaks) {
                indeks = i;
            }
        }
        return indeks;
    }
    //Fungsi menampilkan rata-rata setiap menu
    public static void rataRataMenu(int[][] data, String[] menu, int[] hari){
        System.out.println("\nRata-rata penjualan setiap menu");
        for (int i = 0; i < data.length; i++){
            int total = 0;
            double rata2;
            if (i == 0 || i ==1) {
                System.out.print(menu[i] + "\t\t: ");
            }else{
                System.out.print(menu[i] + "\t: ");
            }
            for (int j = 0; j < data[i].length; j++){
                total += data[i][j];
            }
            rata2 = (double) total / hari.length;
            System.out.print(rata2);
            System.out.println();
        }
    }
}