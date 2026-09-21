package model;

import service.InputValidator;

public class VendorDekorasi extends Vendor {
    private final String temaDekorasi;
    private final String jenisDekorasi;
    private int hargaPaketDekorasi;

    public VendorDekorasi(int idVendor, String namaVendor, String noTelepon, String temaDekorasi,
                           String jenisDekorasi, int hargaPaketDekorasi) {
        super(idVendor, namaVendor, noTelepon);
        this.temaDekorasi = temaDekorasi;
        this.jenisDekorasi = jenisDekorasi;
        setHargaPaketDekorasi(hargaPaketDekorasi);
    }

    public String getTemaDekorasi() {
        return temaDekorasi;
    }

    public String getJenisDekorasi() {
        return jenisDekorasi;
    }

    public int getHargaPaketDekorasi() {
        return hargaPaketDekorasi;
    }

    public void setHargaPaketDekorasi(int hargaPaketDekorasi) {
        if (InputValidator.isHargaValid(hargaPaketDekorasi)) {
            this.hargaPaketDekorasi = hargaPaketDekorasi;
        } else {
            System.out.println("No no yaa.. Harga tidak boleh 0!");
        }
    }
}