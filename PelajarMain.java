/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2asis;
import java.util.Scanner;
/**
 *
 * @author sunarto
 */
public class PelajarMain {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        try {
            System.out.print("Masukkan Nama\t\t: ");
            String nama = baca.nextLine();
            System.out.print("Masukkan NIP\t\t: ");
            long nip = baca.nextLong();
            System.out.print("Masukkan Nilai Ujian 1\t: ");
            double nilai1 = baca.nextDouble();
            System.out.print("Masukkan Nilai Ujian 2\t: ");
            double nilai2 = baca.nextDouble();
            System.out.print("Masukkan Nilai Tugas\t: ");
            double tugas = baca.nextDouble();
            System.out.println();
            System.out.println("=============== KETERANGAN ===============");

            Pelajar Tugas2Asis = new Pelajar();
            Tugas2Asis.setNama(nama);
            Tugas2Asis.setNip(nip);
            Tugas2Asis.setNilaiUjian1(nilai1);
            Tugas2Asis.setNilaiUjian2(nilai2);
            Tugas2Asis.setNilaiTugas(tugas);
            Tugas2Asis.status();

        } catch (Exception e) {
            System.out.println();
            System.out.println("=============== PERINGATAN ===============");
            System.out.println("Masukkan data dengan benar");
        }
    }

}
