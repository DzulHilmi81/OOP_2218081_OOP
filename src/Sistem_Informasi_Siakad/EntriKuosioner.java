/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Informasi_Siakad;

/**
 *
 * @author dzul hilmi
 */
public class EntriKuosioner extends CelassAbstrack{
    String Nama,Nim,MataKuliah, Dosen,KriteriaPenilaian;
    
    //construktor
    public EntriKuosioner()
    {
        this.Nama ="DZUL HILMI";
        this.Nim ="2218081";
    }
    
 void NamaMhs(String nama){
     this.Nama = nama;
 }   
 void NimMhs(String nim){
     this.Nim = nim;
 }
 
 void MataKuliah(String Matkul){
 this.MataKuliah = Matkul;
 } 
  
 void Dosen(String Dosen){
 this.Dosen = Dosen;
 }
 

 String NamaMhs(){
     return Nama;
 }
 String NimMhs(){
     return Nama;
 }
 String MataKuliah(){
 return MataKuliah;
 }
 String Dosen(){
 return Dosen;
 }

    @Override
    public String penilaian(String a) {
        String c = null;
       switch (a){
            case "Sangat Baik" : c = "Sangat Baik"; break;
            case "Sangat Tinggi" : c = "Sangat Tinggi"; break;
            case "Selalu" : c = "Selalu"; break;
            case "Sangat Tidak Baik" : c = "Sangat Tidak Baik"; break;
            case "Sangat Rendah" : c = "Sangat Rendah"; break;
            case "Tidak Pernah" : c = "Tidak Pernah"; break;
        }
       return a;
    }
}
