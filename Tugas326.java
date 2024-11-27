package Pertemuan13;

import java.util.Scanner;

public class Tugas326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== DATA NILAI MAHASISWA ====");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();
        int[][] nilai = new int[jumlahMahasiswa][jumlahTugas];

        // Input data
        inputData(nilai, sc);
        // Tampilkan data
        tampilkanData(nilai);
        // Cari mahasiswa dengan nilai tertinggi
        int indeks = nilaiTertinggi(nilai);
        System.out.println("\nMahasiswa dengan nilai terbanyak:");
        System.out.println("Mahasiswa ke-" + (indeks + 1));
        // Tampilkan rata-rata nilai
        rataRataNilai(nilai);

        sc.close();
    }

    // Fungsi menginputkan data
    public static void inputData(int[][] arr, Scanner sc) {
        System.out.println("\nMasukkan data nilai mahasiswa");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Tugas ke-" + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    // Fungsi menampilkan data
    public static void tampilkanData(int[][] arr) {
        System.out.println("\nData nilai mahasiswa:");
        // Menampilkan tugas
        System.out.print("Tugas\t\t");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print((i + 1) + "\t");
        }
        System.out.println();

        // Menampilkan nilai mahasiswa
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Fungsi mencari nilai tertinggi
    public static int nilaiTertinggi(int[][] arr) {
        int[] total = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total[i] += arr[i][j];
            }
        }

        int nilaiMaks = total[0];
        int indeks = 0;

        for (int i = 1; i < total.length; i++) {
            if (total[i] > nilaiMaks) {
                nilaiMaks = total[i];
                indeks = i;
            }
        }
        return indeks;
    }

    // Fungsi menampilkan rata-rata nilai setiap mahasiswa
    public static void rataRataNilai(int[][] arr) {
        System.out.println("\nRata-rata nilai setiap mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
            double rata2 = (double) total / arr[i].length;
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + rata2);
        }
    }
}
