/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2asis;

/**
 *
 * @author sunarto
 */
public class Buku {
    private String Pengarang;
    private String judulBuku;
    private int thTerbit;
    private int cetakanKe;
    private double hJual;

    public Buku() {
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String namaPengarang) {
        this.Pengarang = namaPengarang;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public int getThTerbit() {
        return thTerbit;
    }

    public void setThTerbit(int tahunTerbit) {
        this.thTerbit = tahunTerbit;
    }

    public int getCetakanKe() {
        return cetakanKe;
    }

    public void setCetakanKe(int cetakanKe) {
        this.cetakanKe = cetakanKe;
    }

    public double getHJual() {
        return hJual;
    }

    public void setHJual(double hargaJual) {
        this.hJual = hargaJual;
    }

    public void infoBuku() {
        System.out.println("INFORMASI BUKU");
        System.out.println("Nama Pengarang\t\t: " + getPengarang());
        System.out.println("Judul Buku\t\t: " + getJudulBuku());
        System.out.println("Tahun Terbit\t\t: " + getThTerbit());
        System.out.println("Cetakan Ke\t\t: " + getCetakanKe());
        System.out.println("Harga Jual\t\t: Rp" + getHJual() + "0");
        System.out.println("==================================================");
    }

}
