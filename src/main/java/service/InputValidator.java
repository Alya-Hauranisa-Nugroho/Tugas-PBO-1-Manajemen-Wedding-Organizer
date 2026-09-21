package service;

import java.util.Scanner;

public class InputValidator {

    public static boolean isHargaValid(int harga) {
        return harga > 0;
    }

    public static boolean isPaxValid(int pax) {
        return pax > 0;
    }

    public static int bacaHargaValid(Scanner scanner) {
        int harga = scanner.nextInt();
        scanner.nextLine();
        while (!isHargaValid(harga)) {
            System.out.println("No no yaa.. Harga tidak boleh 0!");
            System.out.print("Masukkan harga lagi: ");
            harga = scanner.nextInt();
            scanner.nextLine();
        }
        return harga;
    }

    public static int bacaPaxValid(Scanner scanner) {
        int pax = scanner.nextInt();
        scanner.nextLine();
        while (!isPaxValid(pax)) {
            System.out.println("No no yaa.. Jumlah pax tidak boleh 0!");
            System.out.print("Masukkan jumlah pax lagi: ");
            pax = scanner.nextInt();
            scanner.nextLine();
        }
        return pax;
    }
}