import java.util.Scanner;

class Produk{
    String ID;
    String nama;
    int stok;
    int harga;

    void setID(String ID) {
        this.ID = ID;
    }
    void setNama(String nama) {
        this.nama = nama;
    }
    void setStok(int stok) {
        this.stok = stok;
    }
    void setHarga(int harga) {
        this.harga = harga;
    }

    void Detail() { 
        System.out.println("ID: " + ID);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
    }
    void getStok() { 
        if (stok == 0) {
            System.out.println("Stok produk " + nama + " habis.");
        } else {
            System.out.println("Stok: " + stok);
        }
    }
}

class TP2_2_H071231059 {
    public static void main(String[] args) {
        Produk keychain = new Produk();
        keychain.setID("K0135035");
        keychain.setNama("Key Chain");
        keychain.setHarga(90000);
        keychain.setStok(44);

        Produk tapestry = new Produk();
        tapestry.setID("T0232001");
        tapestry.setNama("Tapestry");
        tapestry.setHarga(200000);
        tapestry.setStok(0);

        Produk acrylic = new Produk();
        acrylic.setID("A0388445");
        acrylic.setNama("Acrylic Stand");
        acrylic.setHarga(90000);
        acrylic.setStok(34);
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI HoloShop \n1. Key Chain \n2. Tapestry \n3. Acrylic Stand \nSilahkan masukkan pilihan anda:");
        int input = scanner.nextInt();
        Produk pilihan = null; 

        switch (input) {
            case 1:
                pilihan = keychain;
                break; 
            case 2:
                pilihan = tapestry;
                break; 
            case 3:
                pilihan = acrylic;
                break;
            default:
                System.out.println("Input yang anda masukkan salah.");
                scanner.close();
                return; 
        }

        System.out.println("1. Detail produk \n2. Detail stok \nSilahkan masukkan pilihan anda: ");
        int input2 = scanner.nextInt();
        
        switch (input2) {
            case 1:
                pilihan.Detail();
                break;
            case 2:
                pilihan.getStok();
                break;
            default:
                System.out.println("Input yang anda masukkan salah.");
        }
        scanner.close();
    }
}
