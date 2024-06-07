import java.util.ArrayList;
import java.util.Scanner;

public class MenuSeller {
    Scanner sc = new Scanner(System.in);

    public void menu(User curUser, ArrayList<Customer> listCustomer, LoginRegister lr) {
        while (true) {
            System.out.println("====Welcome Seller " + curUser.username + "====");
            System.out.println("Jumlah Order hari ini : ");
            System.out.println("Menu");
            System.out.println("[1] Tambah menu");
            System.out.println("[2] Lihat menu");
            System.out.println("[3] Update menu");
            System.out.println("[4] Hapus menu");
            System.out.println("[5] Proses menu");
            System.out.print("Choose : ");
            int opt = sc.nextInt();

            if (opt == 1) {
                addMenu(curUser);

            } else if (opt == 2) {
                System.out.println("=======================");
                System.out.println("Lihat Menu");
                System.out.println("=======================");
                ((Seller) curUser).searchDetail();
            } else if (opt == 3) {
                System.out.println("=======================");
                System.out.println("Update Menu");
                System.out.println("=======================");
                ((Seller) curUser).searchDetail();

            } else if (opt == 4) {
                System.out.println("=======================");
                System.out.println("Hapus Menu");
                System.out.println("=======================");
                ((Seller) curUser).searchDetail();
                System.out.print("pilih : ");
                int delete = sc.nextInt();
                ((Seller) curUser).deleteProduk(delete);
                System.out.println("Menu berhasil dihapus");
            } else if (opt == 5) {
                System.out.println("=======================");
                System.out.println("Proses order");
                System.out.println("=======================");
            } else if (opt == 6) {
                lr.menu();
            }
        }
    }

    public void addMenu(User curUser) {

        Produk produk;
        System.out.println("=======================");
        System.out.println("      Tambah Menu");
        System.out.println("=======================");
        System.out.print("Masukkan nama menu : ");
        String nama = sc.next() + sc.nextLine();
        System.out.println("Pilih jenis menu : ");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("pilih : ");
        int opt = sc.nextInt();
        String kategori;
        if (opt == 1) {
            kategori = "makanan";
        } else {
            kategori = "minuman";
        }
        System.out.print("Masukkan deskripsi : ");
        String desc = sc.next() + sc.nextLine();

        System.out.print("Masukkan harga : ");
        int price = sc.nextInt();

        produk = new Produk(nama, desc, price, kategori);
        
        ((Seller) curUser).addProduct(produk);

        System.out.println("Berhasil menambahkan data");
    }

    public void updateMenu() {

    }

    public void prosesOrder() {

    }
}
