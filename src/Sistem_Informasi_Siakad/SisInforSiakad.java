/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Informasi_Siakad;

/**
 *
 * @author dzul hilmi
 */
public class SisInforSiakad {
       public static void main(String[] args) {
        DataMahasiswa Sistem_informasi_Siakad = new DataMahasiswa();
        Sistem_informasi_Siakad.Nim_Mahasiswa("2218081");
        Sistem_informasi_Siakad.Nama_Mahasiswa("Dzul Hilmi");
        Sistem_informasi_Siakad.Prodi_Mahasiswa("Teknik Informatika S1");
        Sistem_informasi_Siakad.Dosen_wali_Mahasiswa("HANI ZULFIA ZAHRO,S.Kom,M.kom");
        Sistem_informasi_Siakad.Th_Akademik("2023");
        Sistem_informasi_Siakad.Semester_Mahasiswa("3");
        System.out.println("Sistem Informasi Siakad ITN Malang");
        System.out.println("------------------------------------");
        System.out.println("NIM : "+ Sistem_informasi_Siakad.Nim_Mahasiswa()); 
        System.out.println("Nama : "+ Sistem_informasi_Siakad.Nama_Mahasiswa()); 
        System.out.println("Prodi : "+ Sistem_informasi_Siakad.Prodi_Mahasiswa()); 
        System.out.println("Dosen Wali : "+ Sistem_informasi_Siakad.Dosen_wali_Mahasiswa()); 
        System.out.println("Th.Akademik : "+ Sistem_informasi_Siakad.Th_Akademik()); 
        System.out.println("Semester : "+ Sistem_informasi_Siakad.Semester_Mahasiswa());
    }

}
