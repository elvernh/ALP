import java.util.LinkedList;
import java.util.Scanner;

public class MenuSeller {
    Scanner sc = new Scanner(System.in);

    public void menu(User curUser, LinkedList<User> listuser, LoginRegister lr) {
        while (true) {
            System.out.println("====Welcome Seller " + curUser.username + "====");
            System.out.println(curUser instanceof Seller);
            System.out.println("Jumlah Order hari ini : ");
            System.out.println("Menu");
            System.out.println("1. Tambah menu");
            System.out.println("2. Lihat menu");
            System.out.println("3. Update menu");
            System.out.println("4. Hapus menu");
            System.out.println("5. Proses menu");
            System.out.print("choose : ");
            int opt = sc.nextInt();

            if (opt == 1) {
                addMenu(curUser);

            } else if (opt == 2) {
                System.out.println("=======================");
                System.out.println("Tambah Menu");
                System.out.println("=======================");
            } else if (opt == 3) {
                System.out.println("=======================");
                System.out.println("Tambah Menu");
                System.out.println("=======================");
            } else if (opt == 4) {
                System.out.println("=======================");
                System.out.println("Tambah Menu");
                System.out.println("=======================");
            } else if (opt == 5) {
                System.out.println("=======================");
                System.out.println("Tambah Menu");
                System.out.println("=======================");
            }
        }
    }

    public void addMenu(User curUser) {

        Produk produk;
        System.out.println("=======================");
        System.out.println("      Tambah Menu");
        System.out.println("=======================");
        System.out.print("masukkan nama menu : ");
        String nama = sc.next() + sc.nextLine();
        System.out.println("pilih jenis menu : ");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("pilih : ");
        int opt = sc.nextInt();
        System.out.print("Masukkan deskripsi : ");
        String desc = sc.next() + sc.nextLine();
        System.out.print("Masukkan kategori : ");
        String kategori = sc.next() + sc.nextLine();
        System.out.print("Masukkan harga : ");
        int price = sc.nextInt();
        if (opt == 1) {
            produk = new Produk(nama, desc, price, kategori);
            ((Seller) curUser).addProduct(produk);
        } else if (opt == 2) {
            produk = new Produk(nama, desc, price, kategori);
            ((Seller) curUser).addProduct(produk);
        }
        System.out.println("berhasil menambahkan data");
    }

    public void deleteMenu() {
        System.out.println("=======================");
        System.out.println("      Hapus Menu");
        System.out.println("=======================");

    }

   

    public void updateMenu() {

    }

    public void prosesOrder() {

    }
}
