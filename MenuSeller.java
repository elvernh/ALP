import java.util.LinkedList;
import java.util.Scanner;

public class MenuSeller {
    Scanner sc = new Scanner(System.in);
    int opt;

    public void Menu(User curUser, LinkedList<User> listuser, LoginRegister lr) {
        while (true) {
            System.out.println("====Welcome Seller " + curUser.username + "====");
            System.out.println("Jumlah Order hari ini : ");
            System.out.println("Menu");
            System.out.println("1. Tambah menu");
            System.out.println("2. Lihat menu");
            System.out.println("3. Update menu");
            System.out.println("4. Hapus menu");
            System.out.println("5. Proses menu");
            System.out.println("choose = ");
            while (true) {
                try {
                    opt = sc.nextInt();
                    if (opt >= 1 && opt <= 5) {
                        break;
                    } else {
                        continue;
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                    sc.next();
                    System.out.println(e);
                    continue;
                }
            }
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
            produk = new Makanan(nama, desc, price, kategori);
            ((Seller) curUser).addProduct(produk);
        } else if (opt == 2) {
           produk = new Minuman(nama, desc, price, kategori);
            ((Seller) curUser).addProduct(produk);
        }
    }

    public void deleteMenu() {
        System.out.println("=======================");
        System.out.println("      Hapus Menu");
        System.out.println("=======================");

    }

    public void seeMenu(User curUser) {
        for (int i = 0; i < ((Seller) curUser).getListProduct().size(); i++) {
        }
    }

    public void updateMenu() {

    }

    public void prosesOrder() {

    }
}
