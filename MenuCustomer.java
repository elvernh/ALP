import java.util.ArrayList;
import java.util.Scanner;

public class MenuCustomer {
    Scanner s = new Scanner(System.in);

    public void menu(User curUser, ArrayList<Seller> listSeller, LoginRegister lr) {
        while (true) {
            System.out.println("====Welcome=====");
            System.out.println("Welcome : " + curUser.getUsername());
            System.out.println("Saldo : " + ((Customer) curUser).getSaldo());
            System.out.println("Poin : " + ((Customer) curUser).getPoints());
            System.out.println("");
            System.out.println("Main Menu");
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Lihat pesanan");
            System.out.println("3. Lihat history pemesanan");
            System.out.println("4. Lihat profil");
            System.out.println("5. Logout");
            System.out.print("Pilih : ");
            int opt = s.nextInt();
            if (opt == 1) {
                pesanMakanan(listSeller, curUser);
            } else if (opt == 2) {

            } else if (opt == 3) {
                
            } else if (opt == 4) {

            } else if (opt == 5) {
                lr.menu();
            }
        }
    }

    public void pesanMakanan(ArrayList<Seller> listSeller, User curUser) {
        showAllSeller(listSeller);
        System.out.print("pilih : ");
        int opt = s.nextInt();
        if (opt > 0 && opt <= listSeller.size()) {
            orderProduk(listSeller.get(opt - 1), curUser);
        }
    }

    public void showAllSeller(ArrayList<Seller> listSeller) {
        for (int i = 0; i < listSeller.size(); i++) {
            System.out.println((i + 1) + ". " + listSeller.get(i).username + " rating ");
            System.out.println("jumlah menu : " + listSeller.get(i).getListProduct().size());
            System.out.println("");
        }
    }

    public void orderProduk(Seller seller, User curUser) {
        Order order = new Order(curUser.getUsername(), seller.getUsername(), ((Customer) curUser).getAlamat());
        while (true) {
            System.out.println("==Menu dari " + seller.getUsername() + "===");
            seller.searchDetail();
            System.out.print("pilih : ");
            int opt = s.nextInt();
            if (opt > 0 && opt <= seller.getListProduct().size()) {
                System.out.println("jumlah : ");
                int jumlah = s.nextInt();
                for (int i = 0; i < jumlah; i++) {
                    order.getListProduct().add(seller.getListProduct().get(opt - 1));
                }
            }
            System.out.println("sudah(y/n) : ");
            String opt1 = s.next();
            if (opt1.equalsIgnoreCase("y")) {
                continue;
            } else if (opt1.equalsIgnoreCase("n")) {
                break;
            }
        }
        int totalPrice = 0;
        for (int i = 0; i < order.getListProduct().size(); i++) {
            totalPrice += order.getListProduct().get(i).getPrice();
        }
        System.out.println("harga akhir : " + totalPrice);
        System.out.println("pesan(y/n) : ");
        String opt2 = s.next();
        if (opt2.equalsIgnoreCase("y")) {
            seller.getListOrder().enqueue(order);
            ((Customer) curUser).addOrder(order);
            System.out.println("order berhasil dibuat");
        } else if (opt2.equalsIgnoreCase("n")) {

        }

    }
}
