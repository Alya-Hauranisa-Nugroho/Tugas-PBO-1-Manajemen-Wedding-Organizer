package model;

import service.InputValidator;

public class PaketWedding {
    private final int idPaket;
    private final String namaPaket;
    private int harga;

    public PaketWedding(int idPaket, String namaPaket, int harga) {
        this.idPaket = idPaket;
        this.namaPaket = namaPaket;
        setHarga(harga);
    }

    public int getIdPaket() {
        return idPaket;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        if (InputValidator.isHargaValid(harga)) {
            this.harga = harga;
        } else {
            System.out.println("No no yaa.. Harga tidak boleh 0!");
        }
    }
}