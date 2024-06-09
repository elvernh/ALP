import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuCustomer {
    Scanner s = new Scanner(System.in);

    public void menu(User curUser, ArrayList<Seller> listSeller, LoginRegister lr) {
        while (true) {
            System.out.println("====Welcome=====");
            LocalDate date = LocalDate.now();
            System.out.println("tanggal : " + date);
            System.out.println("Welcome : " + curUser.getUsername());
            System.out.println("Saldo : " + ((Customer) curUser).getSaldo());
            System.out.println("Poin : " + ((Customer) curUser).getPoints());
            System.out.println("");
            System.out.println("Main Menu");
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Lihat pesanan hari ini");
            System.out.println("3. Lihat history pemesanan");
            System.out.println("4. Lihat profil");
            System.out.println("5. Top up");
            System.out.println("6. Logout");
            System.out.print("Pilih : ");
            int opt = s.nextInt();
            if (opt == 1) {
                pesanMakanan(listSeller, curUser);
            } else if (opt == 2) {
                ((Customer) curUser).showOrder();
            } else if (opt == 3) {
                ((Customer) curUser).showOrder();
                System.out.println("pilih pesanan untuk beri rating : ");
            } else if (opt == 4) {

            } else if (opt == 5) {
                System.out.print("masukkan jumlah : ");
                int jumlah = s.nextInt();
                ((Customer) curUser).topUp(jumlah);
            } else if (opt == 6) {
                lr.menu();
            }
        }
    }

    public void pesanMakanan(ArrayList<Seller> listSeller, User curUser) {
        showAllSeller(listSeller);
        System.out.print("pilih : ");
        int opt = s.nextInt();
        if (opt > 0 && opt <= listSeller.size()) {
            if(listSeller.get(opt - 1).getListProduct().size() > 0) {
            orderProduk(listSeller.get(opt - 1), curUser);
            }else {
                System.out.println("seller belum memiliki menu");
            }
        }
    }

    public void showAllSeller(ArrayList<Seller> listSeller) {
        for (int i = 0; i < listSeller.size(); i++) {
            System.out.println((i + 1) + ". " + listSeller.get(i).username + " rating " + listSeller.get(i).avgRating());
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
                break;
            } else if (opt1.equalsIgnoreCase("n")) {
                continue;
            }
        }
        int totalPrice = 0;
        for (int i = 0; i < order.getListProduct().size(); i++) {
            totalPrice += order.getListProduct().get(i).getPrice();
        }
        System.out.println("harga akhir : " + totalPrice);
        System.out.println("pesan(y/n) : ");
        String opt2 = s.next();
        if (((Customer) curUser).getSaldo() >= totalPrice) {
            if (opt2.equalsIgnoreCase("y")) {
                seller.getListOrder().enqueue(order);
                ((Customer) curUser).addOrder(order);
                ((Customer) curUser).setSaldo(((Customer) curUser).getSaldo() - totalPrice);
                order.setTotal(totalPrice);
                System.out.println("order berhasil dibuat");
                ((Customer) curUser).addPoints(totalPrice);
            } else if (opt2.equalsIgnoreCase("n")) {
                System.out.println("pesanan dibatalkan");
            }
        } else {
            System.out.println("uang anda tidak mencukupi");
        }

    }
}
