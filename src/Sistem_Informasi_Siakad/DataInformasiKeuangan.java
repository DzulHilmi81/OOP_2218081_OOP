/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Informasi_Siakad;

/**
 *
 * @author dzul hilmi
 */
public class DataInformasiKeuangan extends DataInformasiAkademik {
    private String tagihan;
    String virtualaccount; 

// construction
 public DataInformasiKeuangan (){
 this.tagihan = "UKT 6.400.000,00";
 this.virtualaccount = "Ajukan Cicilan";
 }
// method
 void datatagihan(String tagihan){
 this.tagihan = tagihan;
   }
 void datavirtualaccount(String Vaccount){
 this.virtualaccount = Vaccount;
 }
// method class
 void Nim_Mahasiswa(String Nim){
 this.nim = Nim;
 }
 void Nama_Mahasiswa(String Nama){
 this.nama = Nama;
 }
 void Prodi_Mahasiswa(String Prodi){
 this.prodi = Prodi;
 }
 void Semester_Mahasiswa(String Semester){
 this.Semester = Semester;
 }

 String cetakJadwal(){
 return jadwalK;
 }
 String cetakNim(){
 return nim;
 }
 String cetakNama(){
 return nama;
  }
 String cetakProdi(){
 return prodi;
}
 String cetakSemester(){
 return Semester;
}
  String cetaktagihan(){
 return tagihan;
  }
 String cetakvirtualaccount(){
 return virtualaccount;
}

}
