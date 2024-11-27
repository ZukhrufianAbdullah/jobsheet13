package Pertemuan13;

public class PengunjungCafe26 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) { // Menggunakan for-each loop
            System.out.println("- " + nama);
        }
    }
}
