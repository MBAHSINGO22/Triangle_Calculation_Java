package Modul_2;

// Kelas SegitigaMain digunakan sebagai titik masuk utama untuk menjalankan program
public class SegitigaMain {
    // Metode main adalah titik masuk utama dari program Java
    // Tipe data: public (dapat diakses dari kelas lain), static (metode dapat diakses tanpa membuat objek kelas), void (tipe pengembalian, tidak ada nilai yang dikembalikan), main (nama metode), String[] args (parameter)
    public static void main(String[] args) {
        // Membuat objek seg1 dari kelas Segitiga
        // Tipe data: Segitiga, seg1 (nama variabel), new Segitiga() (pembuatan objek dengan konstruktor default)
        Segitiga seg1=new Segitiga();
        // Pengisian data koordinat titik-titik segitiga seg1
        // Tipe data: seg1.x1, seg1.y1, seg1.x2, seg1.y2, seg1.x3, seg1.y3 (variabel anggota), = (operator penugasan), 1, 2, 7, 2, 7, 9 (nilai koordinat)
        seg1.x1=1; seg1.y1=2;
        seg1.x2=7; seg1.y2=2;
        seg1.x3=7; seg1.y3=9;
        // Menghitung dan menampilkan luas segitiga seg1
        // Tipe data: System.out.println (metode untuk menampilkan output), "Luas segitiga dengan titik (1,2), (7,2) dan (7,9) adalah :" (string), + (operator penjumlahan string), seg1.hitungLuas() (memanggil metode hitungLuas dari objek seg1)
        System.out.println("Luas segitiga dengan titik (1,2), (7,2) dan (7,9) adalah :" + seg1.hitungLuas());
        // Membuat objek seg2 dari kelas Segitiga
        // Tipe data: Segitiga, seg2 (nama variabel), new Segitiga() (pembuatan objek dengan konstruktor default)
        Segitiga seg2=new Segitiga();
        // Pengisian data koordinat titik-titik segitiga seg2
        // Tipe data: seg2.x1, seg2.y1, seg2.x2, seg2.y2, seg2.x3, seg2.y3 (variabel anggota), = (operator penugasan), 0, 0, 5, 4, 8, 2 (nilai koordinat)
        seg2.x1=0; seg2.y1=0; seg2.x2=5; seg2.y2=4;
        seg2.x3=8; seg2.y3=2;
        // Menghitung dan menampilkan luas segitiga seg2
        // Tipe data: System.out.println (metode untuk menampilkan output), "Luas segitiga dengan titik (0,0), (5,4) dan (8,2) adalah :" (string), + (operator penjumlahan string), seg2.hitungLuas() (memanggil metode hitungLuas dari objek seg2)
        System.out.println("Luas segitiga dengan titik (0,0), (5,4) dan (8,2) adalah :" + seg2.hitungLuas());
    }
}
        

