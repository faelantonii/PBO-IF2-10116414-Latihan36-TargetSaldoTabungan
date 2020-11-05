/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan36_TargetSaldoTabungan;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan target saldo tabungan
 */
public class PBO_IF2_10116414_TargetSaldoTabungan {
    public static void main(String[] args) {
        HitungSaldo tab = new HitungSaldo();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungSaldoTarget(tab.saldo,saldoTarget);
    }
}
