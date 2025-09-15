/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tuf Gaming
 */
public class Tiket {
    private String namaKonser;
    private String tanggal;
    private double harga;

    // Constructor
    public Tiket(String namaKonser, String tanggal, double harga) {
        this.namaKonser = namaKonser;
        this.tanggal = tanggal;
        this.harga = harga;
    }

    // Getter & Setter
    public String getNamaKonser() {
        return namaKonser;
    }

    public void setNamaKonser(String namaKonser) {
        this.namaKonser = namaKonser;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}

