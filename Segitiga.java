package Modul_2;

// Kelas Segitiga digunakan untuk merepresentasikan segitiga dengan koordinat titik-titiknya
public class Segitiga {

    // Variabel anggota untuk menyimpan koordinat titik-titik segitiga
    // Tipe data: double, x1, y1, x2, y2, x3, y3 (nama variabel)
    public double x1, y1, x2, y2, x3, y3;

    // Metode untuk menghitung panjang sisi segitiga
    // Tipe data: public (dapat diakses dari kelas lain), double (tipe pengembalian), hitungSisi (nama metode), double xa, double ya, double xb, double yb (parameter)
    public double hitungSisi(double xa, double ya,
            double xb, double yb) {
        // Menghitung jarak antara dua titik menggunakan rumus jarak antara dua titik
        // Tipe data: return (kata kunci), Math.sqrt (fungsi untuk menghitung akar kuadrat), Math.pow (fungsi untuk menghitung pangkat), xa - xb (perbedaan koordinat x), ya - yb (perbedaan koordinat y)
        return Math.sqrt(Math.pow(xa - xb, 2) +
                Math.pow(ya - yb, 2));
    }

    // Metode untuk menghitung keliling segitiga
    // Tipe data: public (dapat diakses dari kelas lain), double (tipe pengembalian), hitungKeliling (nama metode)
    public double hitungKeliling() {
        // Menghitung keliling segitiga dengan menjumlahkan panjang sisi-sisinya
        // Tipe data: return (kata kunci), hitungSisi (memanggil metode hitungSisi), x1, y1, x2, y2 (parameter), hitungSisi (memanggil metode hitungSisi), x2, y2, x3, y3 (parameter), hitungSisi (memanggil metode hitungSisi), x3, y3, x1, y1 (parameter)
        return hitungSisi(x1, y1, x2, y2) +
                hitungSisi(x2, y2, x3, y3) + hitungSisi(x3, y3, x1, y1);
    }

    // Metode untuk menghitung luas segitiga
    // Tipe data: public (dapat diakses dari kelas lain), double (tipe pengembalian), hitungLuas (nama metode)
    public double hitungLuas() {
        // Menghitung luas segitiga dengan rumus luas berdasarkan keliling dan sisi
        // Tipe data: double, s (variabel lokal untuk menyimpan keliling), Math.sqrt (fungsi untuk menghitung akar kuadrat), s (variabel lokal), hitungSisi (memanggil metode hitungSisi), x1, y1, x2, y2 (parameter), hitungSisi (memanggil metode hitungSisi), x2, y2, x3, y3 (parameter), hitungSisi (memanggil metode hitungSisi), x3, y3, x1, y1 (parameter)
        double s = hitungKeliling();
        return Math.sqrt(s * (s - hitungSisi(x1, y1, x2, y2)) *
                (s - hitungSisi(x2, y2, x3, y3)) *
                (s - hitungSisi(x3, y3, x1, y1)));
    }
}
