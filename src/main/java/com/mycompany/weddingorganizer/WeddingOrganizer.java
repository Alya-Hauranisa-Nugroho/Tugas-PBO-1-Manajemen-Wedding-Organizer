package com.mycompany.weddingorganizer;

import java.util.Scanner;
import service.WeddingCRUD;

public class WeddingOrganizer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        WeddingCRUD weddingCRUD = new WeddingCRUD(scanner);

        boolean berjalan = true;

        while (berjalan) {

            System.out.println("=====================================");
            System.out.println("|           Houry do Wedds           |");
            System.out.println("|         WEDDING ORGANIZER          |");
            System.out.println("=====================================");
            System.out.println("|             MENU UTAMA             |");
            System.out.println("=====================================");
            System.out.println("1. Menu Tambah");
            System.out.println("2. Menu Tampilkan");
            System.out.println("3. Menu Update");
            System.out.println("4. Menu Hapus");
            System.out.println("5. Keluar >>>");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> {
                    boolean berjalanTambah = true;
                    while (berjalanTambah) {
                        System.out.println("=====================================");
                        System.out.println("|            MENU TAMBAH             |");
                        System.out.println("=====================================");
                        System.out.println("1. Tambah Pelanggan");
                        System.out.println("2. Tambah Paket Wedding");
                        System.out.println("3. Tambah Pemesanan Wedding");
                        System.out.println("4. Tambah Vendor");
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.print("Pilih menu (1-5): ");
                        int pilihanTambah = scanner.nextInt();
                        scanner.nextLine();

                        switch (pilihanTambah) {
                            case 1 -> weddingCRUD.tambahPelanggan();
                            case 2 -> weddingCRUD.tambahPaket();
                            case 3 -> weddingCRUD.tambahPemesanan();
                            case 4 -> weddingCRUD.tambahVendor();
                            case 5 -> {
                                berjalanTambah = false;
                                System.out.println("Kembali ke menu utama yah :D");
                            }
                            default -> System.out.println("Pilihan kamu tidak valid ^__^");
                        }
                    }
                }
                case 2 -> {
                    boolean berjalanTampilkan = true;
                    while (berjalanTampilkan) {
                        System.out.println("=====================================");
                        System.out.println("|           MENU TAMPILKAN            |");
                        System.out.println("=====================================");
                        System.out.println("1. Tampilkan Pelanggan");
                        System.out.println("2. Tampilkan Paket Wedding");
                        System.out.println("3. Tampilkan Pemesanan Wedding");
                        System.out.println("4. Tampilkan Vendor");
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.print("Pilih menu (1-5): ");
                        int pilihanTampilkan = scanner.nextInt();
                        scanner.nextLine();

                        switch (pilihanTampilkan) {
                            case 1 -> weddingCRUD.tampilkanPelanggan();
                            case 2 -> weddingCRUD.tampilkanPaket();
                            case 3 -> weddingCRUD.tampilkanPemesanan();
                            case 4 -> weddingCRUD.tampilkanVendor();
                            case 5 -> {
                                berjalanTampilkan = false;
                                System.out.println("Kembali ke menu utama yah :D");
                            }
                            default -> System.out.println("Pilihan kamu tidak valid ^__^");
                        }
                    }
                }
                case 3 -> {
                    boolean berjalanUpdate = true;
                    while (berjalanUpdate) {
                        System.out.println("=====================================");
                        System.out.println("|            MENU UPDATE             |");
                        System.out.println("=====================================");
                        System.out.println("1. Update Pelanggan");
                        System.out.println("2. Update Paket Wedding");
                        System.out.println("3. Update Pemesanan Wedding");
                        System.out.println("4. Update Vendor");
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.print("Pilih menu (1-5): ");
                        int pilihanUpdate = scanner.nextInt();
                        scanner.nextLine();

                        switch (pilihanUpdate) {
                            case 1 -> weddingCRUD.updatePelanggan();
                            case 2 -> weddingCRUD.updatePaket();
                            case 3 -> weddingCRUD.updatePemesanan();
                            case 4 -> weddingCRUD.updateVendor();
                            case 5 -> {
                                berjalanUpdate = false;
                                System.out.println("Kembali ke menu utama yah :D");
                            }
                            default -> System.out.println("Pilihan kamu tidak valid ^__^");
                        }
                    }
                }
                case 4 -> {
                    boolean berjalanHapus = true;
                    while (berjalanHapus) {
                        System.out.println("=====================================");
                        System.out.println("|             MENU HAPUS             |");
                        System.out.println("=====================================");
                        System.out.println("1. Hapus Pelanggan");
                        System.out.println("2. Hapus Paket Wedding");
                        System.out.println("3. Hapus Pemesanan Wedding");
                        System.out.println("4. Hapus Vendor");
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.print("Pilih menu (1-5): ");
                        int pilihanHapus = scanner.nextInt();
                        scanner.nextLine();

                        switch (pilihanHapus) {
                            case 1 -> weddingCRUD.hapusPelanggan();
                            case 2 -> weddingCRUD.hapusPaket();
                            case 3 -> weddingCRUD.hapusPemesanan();
                            case 4 -> weddingCRUD.hapusVendor();
                            case 5 -> {
                                berjalanHapus = false;
                                System.out.println("Kembali ke menu utama yah :D");
                            }
                            default -> System.out.println("Pilihan kamu tidak valid ^__^");
                        }
                    }
                }
                case 5 -> berjalan = false;
                default -> System.out.println("Pilihan kamu tidak valid ^__^");
            }
        }
        scanner.close();
        System.out.println("BYEEEE!!");
    }
}