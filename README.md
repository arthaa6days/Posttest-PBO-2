# Posttest-PBO-2
Nama : Muhammad Rifqi Jastiartha Nim:2409116117
# 🎟️ Sistem Manajemen Penjualan Tiket Konser

## 📌 Deskripsi Program
Program ini dibuat sebagai simulasi sistem sederhana penjualan tiket konser musik.  
Fitur utama program ini:
- CRUD (Create, Read, Update, Delete) tiket konser
- Pencarian tiket (search) berdasarkan nama konser
- Validasi input untuk mencegah kesalahan pengguna
- Struktur kode dipisahkan ke dalam packages sesuai fungsinya

Program ini dikembangkan menggunakan bahasa **Java** dengan konsep **OOP** serta pola **MVC (Model-View-Controller)** sederhana.

---

## 🗂️ Struktur Packages
Program dipisahkan menjadi 3 packages:

- **model/** → berisi class entity, yaitu `Tiket.java` yang menyimpan data tiket (nama konser, tanggal, harga).
- **service/** → berisi class `TiketService.java` yang mengatur logika CRUD dan pencarian tiket.
- **main/** → berisi `MainApp.java` yang menjadi pintu masuk program (menu interaksi dengan user).

---

## 🏛️ Penerapan MVC
- **Model (M)** → `Tiket.java` (struktur data tiket konser).
- **View (V)** → `MainApp.java` (menampilkan menu dan menerima input dari user).
- **Controller (C)** → `TiketService.java` (mengatur logika CRUD dan search).

---

## ⚙️ Alur Program
1. Program menampilkan menu utama:
   - Tambah Tiket
   - Lihat Tiket
   - Update Tiket
   - Hapus Tiket
   - Cari Tiket
   - Keluar
2. User memilih menu dengan mengetik angka.
3. Program akan menjalankan logika sesuai pilihan user:
   - Tambah Tiket → meminta input nama konser, tanggal, dan harga lalu disimpan ke daftar tiket.
   - Lihat Tiket → menampilkan semua tiket yang sudah ada.
   - Update Tiket → memilih tiket yang ingin diubah, lalu memasukkan data baru.
   - Hapus Tiket → menghapus tiket dari daftar berdasarkan nomor urut.
   - Cari Tiket → mencari tiket berdasarkan kata kunci nama konser.
   - Keluar → program berhenti.
4. Program terus berjalan dalam loop sampai user memilih menu keluar.

---

## ▶️ Cara Menjalankan Program
1. Clone repository:
   ```bash
   git clone https://github.com/username/SistemPenjualanTiketKonser.git
   cd SistemPenjualanTiketKonser/src```
   ```

2.cd SistemPenjualanTiketKonser/src

3.Compile Program
javac model/Tiket.java service/TiketService.java main/MainApp.java

4.Jalankan Program dengan
```bash
java main.MainApp
```

