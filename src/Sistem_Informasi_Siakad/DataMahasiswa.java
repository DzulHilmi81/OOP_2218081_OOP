/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Informasi_Siakad;

/**
 *
 * @author dzul hilmi
 */
public class DataMahasiswa  {
    String Dosen_wali,Th_Akademik;
    String nim, nama,prodi, Semester;
    
    //construktor
    public DataMahasiswa()
    {
        this.nama ="Dzul Hilmi";
        this.nim ="2218081";
    }
    
    

 void Nim_Mahasiswa(String Nim){
 this.nim = Nim;
 } 

 void Nama_Mahasiswa(String Nama){
 this.nama = Nama;
 }
 void Prodi_Mahasiswa(String prodi){
 this.prodi = prodi;
 } 
 void Dosen_wali_Mahasiswa(String Dosen_wali){
 this.Dosen_wali = Dosen_wali;
 }
 void Th_Akademik(String Th_Akademik){
 this.Th_Akademik = Th_Akademik;
 }

 void Semester_Mahasiswa(String Semester){
 this.Semester = Semester;
 } 
 
   
 public String Nim_Mahasiswa(){
 return nim;
 }
  
 public String Nama_Mahasiswa(){
 return nama;
 }
 String Prodi_Mahasiswa(){
 return prodi;
 }
 String Dosen_wali_Mahasiswa(){
 return Dosen_wali;
}
 String Th_Akademik(){
 return Th_Akademik;
 }
   
 public String Semester_Mahasiswa(){
 return Semester;
 }

 
    public void dataMahasiswa(String prodi) {
        prodi= this.prodi;
    }


    public String cetakNama() {
        return nama;
    }

  
    public String cetakNim() {
        return nim;
    }


}
