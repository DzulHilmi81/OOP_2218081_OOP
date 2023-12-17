/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Informasi_Siakad;

/**
 *
 * @author dzul hilmi
 */
public class DataInformasiAkademik extends DataMahasiswa {
    private String raportmhs;
    // atribut
String jadwalK; 

// construction
 public DataInformasiAkademik (){
 this.jadwalK = "OBJECT ORIENTED PROGRAMMING";
 this.raportmhs="Lulus";
 }
// method
 void datajadwalK(String jadalK){
 this.jadwalK = jadalK;
 }
 void dataraportmhs(String raport){
 this.raportmhs=raport;
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

 String jadwal(){
 return jadwalK;
 }
 String cetakraport(){
 return raportmhs;
 }
 String ctkkNim(){
 return nim;
 }
 String ctkkNama(){
 return nama;
  }
 String ctkProdi(){
 return prodi;
}
 String ctkSemester(){
 return Semester;
}
}
