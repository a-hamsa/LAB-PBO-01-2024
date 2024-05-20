import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Sound.Audio;

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = null;
        List<Karyawan> daftarKaryawan = new ArrayList<>();
        Organisasi organisasi = new Organisasi(scanner);
        Keluarga keluarga = new Keluarga(scanner);
        boolean exit = false;

        while (!exit) {
            System.out.println("Data karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String pilihan = scanner.nextLine();
    
            switch (pilihan) {
                case "a":
                    karyawan = tambahDataKaryawan(scanner, organisasi, keluarga);
                    if (karyawan != null) {
                        daftarKaryawan.add(karyawan);
                    }
                    break;
                case "b":
                    tampilkanDetailKaryawan(karyawan);
                    break;
                case "c":
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih opsi (a-c).");
            }
        }
    }

    private static Karyawan tambahDataKaryawan(Scanner scanner, Organisasi organisasi, Keluarga keluarga) {
        Karyawan karyawan = new Karyawan();
        Pendidikan pendidikan = new Pendidikan();
        Projek projek = new Projek();
        Pengalaman pengalaman = new Pengalaman();

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        if  (nama.isEmpty() || !nama.matches("[a-zA-Z]+")) {
            System.out.println("Nama harus berupa string");
            return null;
        }
        karyawan.setNama(nama);
        System.out.print("Masukkan umur: ");
        try {
            karyawan.setUmur(Integer.parseInt(scanner.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Inputan harus berupa integer.");
            return null;
        }

        organisasi.setJenisOrganisasi();
        keluarga.nikah();

        System.out.println("Pengalaman sebelumnya:");
        System.out.println("1. Freelancer");
        System.out.println("2. Magang");
        System.out.println("3. Pekerja tetap");
        System.out.println("4. Tidak ada");
        System.out.print("Input: ");
        int jenisPengalaman = Integer.parseInt(scanner.nextLine());
        switch (jenisPengalaman) {
            case 1:
                pengalaman.jenisPekerjaan = "Freelancer";
                break;
            case 2:
                pengalaman.jenisPekerjaan = "Magang";
                break;
            case 3:
                pengalaman.jenisPekerjaan = "Pekerja tetap";
                break;
            case 4:
                pengalaman.jenisPekerjaan = "Tidak ada";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return null;
        }

       
        System.out.print("Gaji sebelumnya: ");
        try {
            karyawan.setGaji(Double.parseDouble(scanner.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Inputan harus berupa angka.");
            return null;
        }

        System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
        String pendidikanTerakhir = scanner.nextLine();
        if (!isValidPendidikan(pendidikanTerakhir)) {
            System.out.println("Pilihan pendidikan tidak valid.");
            return null;
        }

        if (pendidikanTerakhir.equalsIgnoreCase("SD") || pendidikanTerakhir.equalsIgnoreCase("SMP") || karyawan.getUmur() < 18 || pendidikanLulus(karyawan.getUmur()) || karyawan.getUmur() > 30 || projek.jumlahProjek == 1) {
            Audio.playSound("aduhSound.wav");
            System.out.println("===============================");
            System.out.println("Karyawan tidak memenuhi syarat.");
            System.out.println("===============================");
            return null;
        }
    

        System.out.println("Projek IT:");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");
        System.out.print("Input: ");
        int jumlahProjek = Integer.parseInt(scanner.nextLine());
        if (jumlahProjek == 1) {
            Audio.playSound("aduhSound.wav");
            System.out.println("===============================");
            System.out.println("Karyawan tidak memenuhi syarat.");
            System.out.println("===============================");
            return null;
        } else if (jumlahProjek < 1 || jumlahProjek > 4) {
            System.out.println("Pilihan tidak valid.");
            return null;
        }

        projek.setJumlahProjek(jumlahProjek);

        System.out.println();
        pengalaman.prosesKehidupan();
        System.out.println("Pendidikan terakhir: " + pendidikanTerakhir);
        System.out.println("Jumlah projek IT: " + projek.jumlahProjek);
        Audio.playSound("diterima.wav");
        System.out.println("===========================");
        System.out.println("Selamat, karyawan diterima!");
        System.out.println("===========================");

        return karyawan;
    }

    private static boolean pendidikanLulus(int umur) {
        return umur < 15 ||  umur > 40;
    }

    private static boolean isValidPendidikan(String pendidikan) {
        String[] validPendidikan = {"SD", "SMP", "SMA", "SMK", "S1", "S2", "S3"};
        for (String p : validPendidikan) {
            if (pendidikan.equalsIgnoreCase(p)) {
                return true;
            }
        }
        return false;
    }

    private static void tampilkanDetailKaryawan(Karyawan karyawan) {
        if (karyawan == null) {
            System.out.println("Belum ada data karyawan.");
        } else {
            System.out.println("Detail karyawan:");
            System.out.println("Nama: " + karyawan.getNama());
            System.out.println("Umur: " + karyawan.getUmur());
            System.out.println("Jabatan: Karyawan");
            System.out.println("Gaji: " + karyawan.getGaji());
        

        }
    }
}


