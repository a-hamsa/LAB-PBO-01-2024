import java.util.Scanner;

class Produk {
    String id ;
    String nama ; 
    int stok ;
    int harga ;

    public void getInfo(){
        System.out.println("ID : "+ this.id);
        System.out.println("Nama : "+ this.nama);
        System.out.println("Stok : "+ this.stok);
        System.out.println("Harga : "+ this.harga);
        stok();
    }

    public String stok(){
        return(stok > 0 ) ? "stok ada" : "stok habis"; 
    }
    
}

public class livecoding2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Produk produk = new Produk();
        System.out.print("id : ");
        produk.id = scan.nextLine();
        scan.nextLine();

        System.out.print("\nnama : ");
        produk.nama = scan.nextLine();

        System.out.print("\nstok : ");
        produk.stok = scan.nextInt();
        
        System.out.print("\nharga : ");
        produk.harga = scan.nextInt();
        produk.getInfo();
        scan.close();
    }
}
