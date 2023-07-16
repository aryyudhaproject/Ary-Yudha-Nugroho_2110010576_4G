# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan Data Pegawai menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Nama,NIP,Jabatan, Tempat Lahir, Nomor telpon dan memberikan output berupa informasi detail dari NIP dan Nomor Telpon tersebut seperti Tahun Bulan Lahir, Tahun Bulan Masuk, Jenis Kelamin, Nomor Urut CPNS dan Negara .

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pegawai`, `DataPegawai`, dan `PegawaiMain` adalah contoh dari class.

```bash
public class Pegawai {
    ...
}

public class DataPegawai extends Pegawai {
    ...
}

public class PegawaiMain  {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pgw[i] = new DataPegawai(nama, nip, jabatan, lahir, telp);` adalah contoh pembuatan object.

```bash
pgw[i] = new DataPegawai(nama, nip, jabatan, lahir, telp);

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `nip`,` jabatan`,`lahir`,`telp` adalah contoh atribut.

```bash
private String nama, nip, jabatan, lahir,telp;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pegawai` dan `DataPegawai`.

```bash
public Pegawai(String nama, String nip, String jabatan,String lahir, String telp) {
        this.nama = nama;
        this.nip = nip;
        this.jabatan =jabatan;
        this.lahir =lahir;
        this.telp=telp;
    }

public DataPegawai(String nama, String nip, String jabatan, String lahir, String telp) {
        super(nama, nip, jabatan,lahir, telp);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`,`setNip`,`setJabatan`,`setLahir`,`setTelp`, adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public void setLahir(String lahir) {
        this.lahir = lahir;
    }
    
    public void setTelp(String telp) {
        this.telp = telp;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNip`, `getJabatan`, `getLahir`, `getTelp`, `getTTL`,`getThnBln`,`getjeniskelamin`,`getUrut`,dan `gettelp` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }
    public String getJabatan() {
        return jabatan;
    }
    public String getLahir() {
        return lahir;
    }
    
    public String getTelp() {
        return telp;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `nip`, `jabatan`, `lahir`,dan `telp` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama, nip, jabatan, lahir,telp;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `DataPegawai` mewarisi `Pegawai` dengan sintaks `extends`.

```bash
public class DataPegawai extends Pegawai {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Pegawai` merupakan overloading method `displayInfo` dan `displayInfo` di `DataPegawai` merupakan override dari method `displayInfo` di `Pegawai`.

```bash

    public String displayInfo(){
        return "Nama :"+getNama()+
                "\nNIP :"+getNip()+
                "\nJabatan :"+getJabatan()+
                "\nTempat Lahir :"+getLahir()+
                "\nNomor Telpon :"+getTelp();
    }

@Override
     public String displayInfo(){
         return super.displayInfo()+
                 "\nTahun Bulan Tanggal Lahir :"+getTTL()+
                 "\nTahun Bulan Masuk :"+getThnBln()+
                 "\nJenis Kelamin :"+getjeniskelamin()+
                 "\nNomor Urut CPNS :"+getUrut()+
                 "\nNegara :"+gettelp();
     }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getjeniskelamin` dan seleksi `if else` dalam method `gettelp`.

```bash
public String getjeniskelamin(){
        String jk = getNip().substring(14,15);
        //Seleksi Switch
        switch(jk){
            case "1":
                return "Laki-laki";
            case "2":
                return "Perempuan";
            default : 
                return "Ooppss!!! Jenis Kelamin Tidak Diketahui...";
        }
        
    }

public String gettelp(){
        String jk = getTelp().substring(0,2);
        //Seleksi If
        if(jk.equals("62")){
                return "Indonesia";
        } else if(jk.equals("08")){
                return "Indonesia";
        }
                return "Oopss!!! Kode yang dimasukkan salah...";
                } 
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<pgw.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash

Scanner scanner = new Scanner(System.in);

System.out.println("MASUKKAN NAMA DATA PEGAWAI BERIKUT!!!...");
        System.out.print("Nama Pegawai " +(i+1)+":");
        String nama = scanner.nextLine();
        System.out.print("NIP Pegawai "+(i+1)+":");
        String nip = scanner.nextLine();
        System.out.print("Jabatan Pegawai "+(i+1)+":");
        String jabatan = scanner.nextLine();
        System.out.print("Tempat Lahir "+(i+1)+":");
        String lahir = scanner.nextLine();
        System.out.print("Nomor Telpon "+(i+1)+":");
        String telp = scanner.nextLine();

System.out.println("--------------------------");
        System.out.println("Data Pegawai");
        System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `DataPegawai[] pgw = new DataPegawai[3];` adalah contoh penggunaan array.

```bash
DataPegawai[] pgw = new DataPegawai[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try{
    .................
} catch (NumberFormatException e) {
            System.out.println("Kesalahan Nomor: Mohon Dicek Kembali..."
                    +e.getMessage());
    } catch (StringIndexOutOfBoundsException e){
            System.out.println("Format NIP Salah: Mohon Dicek Kembali...."
                    +e.getMessage());
    } catch (Exception e) {
            System.out.println("Kesalahan Umum : Silahkan Dicek Kembali..."
                    +e.getMessage());
            }   
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ary Yudha Nugroho
NPM: 2110010576
