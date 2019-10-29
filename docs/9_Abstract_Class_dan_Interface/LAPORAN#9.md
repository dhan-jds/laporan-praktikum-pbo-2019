# Laporan Praktikum #7 - OVERRIDING DAN OVERLOADING

## Kompetensi

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu:
1. Menjelaskan maksud dan tujuan penggunaan Abstract Class;
2. Menjelaskan maksud dan tujuan penggunaan Interface;
3. Menerapkan Abstract Class dan Interface di dalam pembuatan program.

## Ringkasan Materi

Mempelajari tentang Abstract Class dan Interface

## Percobaan Abstract Class

Membuat class hewan
![screenshot](img/Screenshot_1.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/Hewan1841720112Dhan.java)

Membuat class kucing
![screenshot](img/Screenshot_2.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/Kucing1841720112Dhan.java)

Membuat class ikan
![screenshot](img/Screenshot_3.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/Ikan1841720112Dhan.java)

Membuat class orang
![screenshot](img/Screenshot_4.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/Orang1841720112Dhan.java)

Membuat class main program
![screenshot](img/Screenshot_5.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/Program1841720112Dhan.java)

## Pertanyaan Diskusi

Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan!

    Jawab: Tidak boleh, class yang meng-extend abstract class harus mengimplementasikan method abstractnya, kalau tidak akan muncul tanda merah di sebelah kiri yang berisi perintah untuk mengimplementasi method abstract

## Percobaan Interface

Membuat interface ICumlaude
![screenshot](img/Screenshot_6.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/ICumlaude1841720112Dhan.java)

Membuat class Mahasiswa
![screenshot](img/Screenshot_7.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/Mahasiswa1841720112Dhan.java)

Membuat class Sarjana
![screenshot](img/Screenshot_8.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/Sarjana1841720112Dhan.java)

Membuat class PascaSarjana
![screenshot](img/Screenshot_9.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/PascaSarjana1841720112Dhan.java)

Membuat class Rektor
![screenshot](img/Screenshot_10.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/Rektor1841720112Dhan.java)

Membuat class main program
![screenshot](img/Screenshot_11.png)

Membuat class main program agar berjalan sesuai ketentuan
![screenshot](img/Screenshot_12.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/MainInterface1841720112Dhan.java)

## Pertanyaan Diskusi

a. Mengapa pada langkah nomor 9 terjadi error? Jelaskan!

    Jawab: Karena pada class mahasiswa tidak diimplementasikan dari class interface yaitu class ICumlaude

b. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian?

    Jawab: Bisa karena class sarjana merupakan sub class dari class mahasiswa

c. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?

    Jawab: Tidak bisa, karena method kuliahDiKampus berada di class Mahasiswa, dimana belum di implementasikan ke class interface. Sedangkan parameter mahasiswa di method berSertifikatCumlaude() bertipe data ICumlaude(interface)


d. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini: ![screenshot](img/soal.png)

    Jawab:
![screenshot](img/jawabsoal.png)

## Percobaan Multiple Interfaces Implementation

Membuat interface IBerprestasi
![screenshot](img/Screenshot_13.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/IBerprestasi1841720112Dhan.java)

Memodifikasi class PascaSarjana
![screenshot](img/Screenshot_14.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/PascaSarjana1841720112Dhan.java)

Memodifikasi class Rektor
![screenshot](img/Screenshot_15.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/Rektor1841720112Dhan.java)

Memodifikasi class main program
![screenshot](img/Screenshot_16.png)

Membuat class main program agar berjalan sesuai ketentuan
![screenshot](img/Screenshot_17.png)

Link kode program : [ini link ke kode program](../../src/9_Abstract_Class_dan_Interface/MainInterface1841720112Dhan.java)

## Pertanyaan Diskusi

Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude.

    Jawab: 

## Kesimpulan

Abstract merupakan class yang tidak dapat diinstansiasi namun dapat diextend. Abstract class baru dapat dimanfaatkan ketika di-extend. Sedangkan Interface adalah struktur data yang hanya berisi abstract methods. Tidak ada apa-apa selain method abstract pada interface, termasuk atribut getter dan setter.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

**Muhammad Wildhan Juniar Diharja Sardhany**