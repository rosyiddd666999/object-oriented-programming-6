package main;

import ClassZakat.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ZakatApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        boolean running = true;
        boolean memenuhiSyarat = false; 

        while (!memenuhiSyarat) {
            Human human = new Human();
            System.out.println("\n==============WELCOME TO ZAKAT COUNT APP================");

            System.out.print("Masukkan nama: ");
            human.setName(input.nextLine());
            System.out.print("Masukkan umur: ");
            human.setBalighAge(input.nextInt());
            input.nextLine(); 

            System.out.print("Apakah anda berakal sehat? (y/n): ");
            String akalSehat = input.nextLine();
            human.setIsCrazy(akalSehat.equalsIgnoreCase("n"));

            
            if (human.getBalighAge() >= 9 && !human.getIsCrazy()) {
                memenuhiSyarat = true;

                System.out.print("Masukkan alamat: ");
                human.setAlamat(input.nextLine());
                System.out.print("Masukkan pekerjaan: ");
                human.setPekerjaan(input.nextLine());

                System.out.println(
                    "Nama: " + human.getName() +
                    "\nUmur: " + human.getBalighAge() +
                    "\nStatus Kesehatan Mental: " + (human.getIsCrazy() ? "Tidak Sehat" : "Sehat") +
                    "\nAlamat: " + human.getAlamat() +
                    "\nPekerjaan: " + human.getPekerjaan()
                );

                while (running) {
                    System.out.println("\n================= MENU ZAKAT =================");
                    System.out.println("1. Zakat Mal");
                    System.out.println("2. Zakat Emas");
                    System.out.println("3. Zakat Perak");
                    System.out.println("4. Zakat Pertanian");
                    System.out.println("5. Zakat Perdagangan");
                    System.out.println("6. Keluar");
                    System.out.println("===============================================");
                    System.out.print("Pilih jenis zakat yang ingin dihitung: ");
                    int pilihan = input.nextInt();

                    double hasilZakat = 0; 

                    switch (pilihan) {
                        case 1:
                            System.out.print("Masukkan total harta (zakat mal): Rp.");
                            double harta = input.nextDouble();
                            ZakatMal zakatM = new ZakatMal();
                            zakatM.setZakatMal(harta);
                            hasilZakat = zakatM.getCalculateZakat();
                            break;

                        case 2:
                            System.out.print("Masukkan total emas (gram): ");
                            double emas = input.nextDouble();
                            ZakatEmas zakatE = new ZakatEmas();
                            zakatE.setZakatEmas(emas);
                            hasilZakat = zakatE.getCalculateZakat();
                            break;

                        case 3:
                            System.out.print("Masukkan total perak (gram): ");
                            double perak = input.nextDouble();
                            ZakatPerak zakatP = new ZakatPerak();
                            zakatP.setZakatPerak(perak);
                            hasilZakat = zakatP.getCalculateZakat();
                            break;

                        case 4:
                            System.out.print("Masukkan total hasil panen (kg): ");
                            double panen = input.nextDouble();
                            ZakatPertanian zakatPtn = new ZakatPertanian();
                            zakatPtn.setZakatPertanian(panen);
                            hasilZakat = zakatPtn.getCalculateZakat();
                            break;

                        case 5:
                            System.out.print("Masukkan total aset dagang : Rp.");
                            double dagang = input.nextDouble();
                            ZakatPerdagangan zakatPdg = new ZakatPerdagangan();
                            zakatPdg.setZakatPerdagangan(dagang);
                            hasilZakat = zakatPdg.getCalculateZakat();
                            break;

                        case 6:
                            running = false;
                            System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                            continue;

                        default:
                            System.out.println("Pilihan tidak valid, coba lagi.");
                            continue;
                    }

                    if (hasilZakat > 0) {
                        System.out.println("\nNama: " + human.getName());
                        System.out.println("Kewajiban zakat: Rp." + df.format(hasilZakat));
                    } else {
                        System.out.println("Zakat tidak wajib (belum mencapai nishab).");
                    }
                }

            } else {
                System.out.println("\nAnda tidak memenuhi syarat untuk wajib zakat.");
                System.out.println("Syarat wajib zakat: umur >= 9 dan berakal sehat.");
                System.out.println("Silakan masukkan data kembali.\n");
            }
        }

        input.close();
    }
}
