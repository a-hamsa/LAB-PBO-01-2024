package TP7_1_H071231078;
import java.util.Scanner;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Karyawan> dataKaryawan = new ArrayList<>();

        boolean stopper = true;
        while (stopper==true) {


            //menu
            System.out.println("Data Karyawan :");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print(">>> Pilih Opsi (a-c) : ");
            String pilihan1 = scan.nextLine();
            



            switch (pilihan1) {
                case "a":
                    //instance karyawan
                    Karyawan karyawan = new Karyawan();


                    System.out.print("Masukkan nama: ");
                    String Nama = scan.nextLine();
                    utils.inputTestString(Nama);
                    karyawan.setNama(Nama);



                    
                    while (true) {
                        try {
                            System.out.print("Masukkan umur: ");
                            String inputUmur = scan.nextLine();
            
                            if (inputUmur.isEmpty()) {
                                throw new Exception("Umur tidak boleh kosong");
                            }
            
                            int umur = Integer.parseInt(inputUmur);
                            karyawan.setUmur(umur);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Input harus berupa bilangan bulat.");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    
                    


                    //menu pengalaman
                    System.out.println("Pengalaman Sebelumnya :");
                    System.out.println("1. Freelancer");
                    System.out.println("2. Magang");
                    System.out.println("3. Pekerja Tetap");
                    System.out.println("4. Tidak Ada");
                    while (true) {
                        try {
                            System.out.print("Input : ");
                            String inputPengalaman = scan.nextLine();
            
                            if (inputPengalaman.isEmpty()) {
                                throw new Exception("Field tidak boleh kosong");
                            }
            
                            int pengalaman = Integer.parseInt(inputPengalaman);
                            karyawan.pengalamanKerja = karyawan.pekerjaan(pengalaman);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Input harus berupa bilangan bulat.");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    if (karyawan.pengalamanKerja.equals("tidak ada")) {
                        karyawan.setGajiSebelum(0);
                    } else {
                        while (true) {
                            try {
                                System.out.print("Gaji Sebelumnya : ");
                                String inputGajis = scan.nextLine();
                
                                if (inputGajis.isEmpty()) {
                                    throw new Exception("Field tidak boleh kosong");
                                }
                
                                int gajis = Integer.parseInt(inputGajis);
                                karyawan.gajiSebelum = gajis;
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Input harus berupa bilangan bulat.");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }





                    //menu organisasi
                    System.out.println("Pengalaman Organisai :");
                    System.out.print("Input (y/n) : ");
                    String organisasi = scan.nextLine();
                    utils.inputTestString(organisasi);
                    karyawan.pengalamanOrganisasi = karyawan.Organisasi(organisasi);





                    //menu Status Pernikahan
                    System.out.println("Status Pernikahan :");
                    System.out.print("Input (sudah/belum) : ");
                    String pernikahan = scan.nextLine();
                    utils.inputTestString(pernikahan);
                    karyawan.statusPernikahan = karyawan.statusPernikahan(pernikahan);
                    




                    // menu pendidikan
                    System.out.print("Pendidikan Terakhir (SD/SMP/SMA/SMK/S1/S2/S3) : ");
                    String pendidikan = scan.nextLine();
                    utils.inputTestString_2(pendidikan);
                    karyawan.levelPendidikan = karyawan.levelPendidikan(pendidikan);
                    




                    //menu projek
                    System.out.println("Projek IT :");
                    System.out.println("1. Minimal 4");
                    System.out.println("2. Minimal 8");
                    System.out.println("3. Minimal 12");
                    System.out.println("4. Minimal 15");
                    while (true) {
                        try {
                            System.out.print("Input : ");
                            String inputProjek = scan.nextLine();
            
                            if (inputProjek.isEmpty()) {
                                throw new Exception("Field tidak boleh kosong");
                            }
            
                            int projek = Integer.parseInt(inputProjek);
                            karyawan.projekIT = karyawan.pengalamanProjek(projek);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Input harus berupa bilangan bulat.");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }


                    


                    
                    //syarat diterima
                    if (karyawan.projekIT < 8 || karyawan.getUmur() < 18 || karyawan.levelPendidikan.equals("Pendidikan Dasar") || karyawan.levelPendidikan.equals("Pendidikan Menengah Pertama") || karyawan.pengalamanOrganisasi.equals("kosong") || karyawan.pengalamanOrganisasi.equals("tidak")) {
                        System.out.println("Karyawan tidak memenuhi syarat");
                        try {


                            File file = new File("sound\\fail-144746.wav");
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                            Thread.sleep(clip.getMicrosecondLength() / 800);


                        } catch (Exception e) {


                            e.printStackTrace();


                        }
                    } else {

                        System.out.println("=====================");
                        System.out.println("memenuhi...");
                        System.out.println("=====================");


                        try {


                            File file = new File("sound\\success-1-6297.wav");
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                            Clip clip = AudioSystem.getClip();
                            clip.open(audioInputStream);
                            clip.start();
                            Thread.sleep(clip.getMicrosecondLength() / 800);


                        } catch (Exception e) {


                            e.printStackTrace();


                        }

                        System.out.print("Gaji sekarang : ");
                        int gaji = scan.nextInt();
                        scan.nextLine();
                        karyawan.setGaji(gaji);
                        System.out.print("Posisi : ");
                        String posisi = scan.nextLine();
                        karyawan.setJabatan(posisi);
                        dataKaryawan.add(karyawan);
                    }


                    break;

                case "b":
                    if (dataKaryawan.isEmpty()) {
                        System.out.println("=====================");
                        System.out.println("Data Kosong");
                        System.out.println("=====================");
                        break;
                    }else{
                        for (Karyawan i : dataKaryawan) {
                            System.out.println("======Profil Karyawan======");
                            System.out.println("Nama     : " + i.getNama());
                            System.out.println("Umur     : " + i.getUmur());
                            System.out.println("Jabatan  : " + i.getJabatan());
                            System.out.println("Gaji     : " + i.getGaji());
                            System.out.println("=============Data Diri==========");
                            System.out.println("Pengalaman kerja          : " + i.getPengalamanKerja());
                            System.out.println("Pengalaman Organisasi     : " + i.getPengalamanOrganisasi());
                            System.out.println("Status Pernikahan         : " + i.getStatusPernikahan());
                            System.out.println("Pendidikan Sebelumnya     : " + i.getLevelPendidikan());
                            System.out.println("Gaji Sebelumnya           : " + i.getGajiSebelum());
                        }
                    }
                    break;
                case "c":
                    stopper = false;
                    System.out.println("Terima kasih!");
                    break;
                
                default:
                    break;
            }
        }
        scan.close();  
    }
}
