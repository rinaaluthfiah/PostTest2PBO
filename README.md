# PostTest2PBO

Isrina Luthfiah | 2409116003 | 

Sistem Informasi A'24

# DESKRIPSI SINGKAT PROGRAM
Sistem Konsultasi Psikolog merupakan program yang dibuat untuk mengatur dan mengelola data konsultasi antara pasien dan psikolog. Sistem ini berfungsi untuk menyimpan informasi penting seperti nama pasien,keluhan yang dialami, serta jadwal konsultasi yang telah ditentukan. 

Selain itu, sistem konsultasi juga menyediakan fitur untuk menampilkan kembali data yang sudah ada, memperbarui apabila terjadi perubahan, dan menghapus data yang tidak lagi diperlukan.Dengan adanya sistem ini, proses administrasi konsultasi menjadi lebih terstruktur, rapi, dan efisien, sehingga membantu psikolog maupun pengelola layanan dalam memberikan pelayanan yang lebih terorganisir kepada pasien.

# Package 
<img width="304" height="338" alt="Screenshot 2025-09-16 185600" src="https://github.com/user-attachments/assets/b89a3e18-6ba1-4b49-9955-2758d7d8ab53" />

Sistem Konsultasi Psikolog ini memiliki tiga class utama, masing-masing diletakkan di package sesuai fungsinya:

▸ Model (Konsultasi)
Untuk Menyimpan data pasien seperti id, nama, keluhan, dan jadwal.

▸ Service (KonsultasiService) 
Untuk Mengatur semua operasi data seperti tambah, lihat, ubah, hapus, dan cari data pasien.

▸ Main (Main)
Untuk Menampilkan menu dan menerima input dari pengguna.


# PENJELASAN ALUR PROGRAM

## Menu Utama 
<img width="524" height="187" alt="image" src="https://github.com/user-attachments/assets/07a1e31c-6d10-4486-9aed-33d3ed9ea80c" />



Ketika program dijalankan, pengguna akan langsung masuk ke menu utama. 


<img width="561" height="212" alt="image" src="https://github.com/user-attachments/assets/09d3322c-3844-4c96-8252-c6a313d1d7d6" />

 Selanjutnya, pengguna diminta memasukkan angka sesuai dengan menu yang ingin dipilih seperti menambah, menampilkan, memperbarui, menghapus atau bahkan mencari data secara cepat.


<img width="523" height="244" alt="image" src="https://github.com/user-attachments/assets/e408d67c-06ff-41d4-9bbc-11ee3ec573aa" />


 Program meminta pengguna memasukkan angka antara 1 sampai 6 sesuai opsi yang ada. Disini pengguna menginput angka 8, sedangkan pilihan tidak ada di daftar menu. Karena itu, program menampilkan pesan "Pilihan tidak ada, coba lagi!". 


<img width="513" height="232" alt="image" src="https://github.com/user-attachments/assets/fd227f7d-9b55-4d7e-a6ed-d5781e3d55d5" />


Pengguna diminta untuk menginputkan ulang dengan benar, setelah itu akan masuk ke dalam daftar menu yang dipilih.

## 1. Tambah Data Konsultasi 

📝 Data 1

<img width="733" height="320" alt="image" src="https://github.com/user-attachments/assets/1f65d75b-bcec-43d3-8324-f02afaaaf28b" />


📝 Data 2
<img width="676" height="272" alt="image" src="https://github.com/user-attachments/assets/83b33919-8960-40a1-899c-6b653a225e47" />

📝Data 3
<img width="635" height="269" alt="image" src="https://github.com/user-attachments/assets/41fc2046-00c4-4c1b-89ec-a56f1a28d3b7" />


Setelah memilih opsi nomor 1, program meminta pengguna untuk menginput beberapa informasi, yaitu nama pasien, keluhan yang dirasakan, serta jadwal konsultasi. Setelah semua data berhasil diinput, program menampilkan pesan konfirmasi “Data berhasil ditambahkan” sebagai tanda bahwa data pasien telah tersimpan di dalam sistem.

## 2. Tampilkan Data Konsultasi 
<img width="457" height="188" alt="image" src="https://github.com/user-attachments/assets/f8882d1a-a22b-4bf6-b82b-32de33c8e690" />


Disini pengguna menginput angka 2, maka akan menampilkan  seluruh data konsultasi yang ada dalam sistem. 



<img width="495" height="548" alt="image" src="https://github.com/user-attachments/assets/6c1e752f-fe03-4f3e-a415-e19b12139636" />


Program akan menampilkan seluruh data pasien yang telah tersimpan, mulai dari nama pasien, keluhan yang dialami, hingga jadwal konsultasi masing-masing.

## 3. Perbarui Data Konsultasi
<img width="575" height="301" alt="image" src="https://github.com/user-attachments/assets/6a905d7b-fba3-4663-a5f5-f639435ec1c3" />


Pengguna ingin memperbarui data konsultasi, disini pengguna memilih data nomor 2 untuk diubah. Data pasien Siti Rahma diperbarui menjadi Siti Rahma Aulia dengan jadwal konsultasi baru 14-09-2025. Setelah itu, sistem menampilkan pesan “Data berhasil diubah!” sebagai konfirmasi bahwa data berhasil diperbarui.

Sebelum Data  ke-2  diperbarui:

<img width="490" height="122" alt="image" src="https://github.com/user-attachments/assets/3b796b52-47b1-4ebf-9576-be79aad8f19a" />



Setelah Data   diperbarui:

<img width="487" height="121" alt="image" src="https://github.com/user-attachments/assets/d38c539d-ca21-4253-a1b8-22cdbcda0eb0" />




## 4. Hapus Data Konsultasi 
<img width="466" height="238" alt="image" src="https://github.com/user-attachments/assets/aeee0799-fb68-4a9e-b0f5-c28795c1260a" />


Disini pengguna memilih menu program 4, ketika pengguna memasukkan angka 3, program akan menghapus data konsultasi pada urutan tersebut dari sistem. Setelah proses selesai, program menampilkan pesan konfirmasi bahwa data nomor 3 berhasil dihapus.

<img width="490" height="447" alt="image" src="https://github.com/user-attachments/assets/7e443ffb-5af7-4998-899b-bca502caa99a" />


Pengguna ingin memastikan data benar terhapus atau tidak. Dan pada tampilan diatas data ke-3 berhasil dihapus dari sistem.


## 5. Cari Data Konsultasi 
<img width="530" height="347" alt="image" src="https://github.com/user-attachments/assets/2a1f4ffa-b251-4812-b9c4-5276a7a6e347" />

Disini juga terdapat fitur cari data pasien. Pada tampilan diatas pengguna ingin mencari data pasien yang bernama Danie,maka hanya data dengan nama Danie yang akan ditampilkan. Proses pencarian data menjadi lebih cepat dan mudah.

## 6. Keluar
<img width="720" height="335" alt="image" src="https://github.com/user-attachments/assets/969865a8-f0df-4730-940d-60204073b397" />



Jika user memilih menu program 5 yaitu keluar, maka seluruh kegiatan program akan berhenti dan program selesai digunakan.









