package model;

import service.InputValidator;

public class VendorCatering extends Vendor {
    private final String jenisMasakan;
    private final String sistemPenyajian;
    private int hargaPerPax;

    public VendorCatering(int idVendor, String namaVendor, String noTelepon, String jenisMasakan,
                           String sistemPenyajian, int hargaPerPax) {
        super(idVendor, namaVendor, noTelepon);
        this.jenisMasakan = jenisMasakan;
        this.sistemPenyajian = sistemPenyajian;
        setHargaPerPax(hargaPerPax);
    }

    public String getJenisMasakan() {
        return jenisMasakan;
    }

    public String getSistemPenyajian() {
        return sistemPenyajian;
    }

    public int getHargaPerPax() {
        return hargaPerPax;
    }

    public void setHargaPerPax(int hargaPerPax) {
        if (InputValidator.isHargaValid(hargaPerPax)) {
            this.hargaPerPax = hargaPerPax;
        } else {
            System.out.println("No no yaa.. Harga tidak boleh 0!");
        }
    }
}