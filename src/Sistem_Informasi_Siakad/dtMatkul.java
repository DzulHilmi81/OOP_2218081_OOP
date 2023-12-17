/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistem_Informasi_Siakad;

/**
 *
 * @author dzul hilmi
 */
public class dtMatkul{
    String kode_mk, nama_mk, dosen_pengampu,jmlSks;
    
    void kodeMK(String kode_mk){
        this.kode_mk = kode_mk;
    }
    
    void NamaMK(String namaMK){
        this.nama_mk = namaMK;
    }
    
    void Dosen(String DosenP){
        this.dosen_pengampu = DosenP;
    }
    void JmlSKS(String SKS){
        this.jmlSks = SKS;
    }
    
    String kodeMk() {
        return kode_mk;
    }

    String NamaMK() {
        return nama_mk;
    }

    String Dosen() {
        return dosen_pengampu;
    }

    String JmlSKs() {
        return jmlSks;
    }

}
