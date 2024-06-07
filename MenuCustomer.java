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
                tampilanCustomer(curUser);
            } else if (opt == 5) {
                lr.menu();
            }
        }
    }

    public void tampilanCustomer(User curUser) {
        boolean tf = false;
        System.out.printf("Nama User: %s\n", curUser.getUsername());
        System.out.printf("Role: %s\n", curUser.getRole());
        System.out.printf("E-mail: %s\n", curUser.getEmail());
        System.out.printf("Password: %s\n", curUser.getPwd());
        System.out.println("Mau Edit Profile?(Y/N)");
        String opsi = s.next().toLowerCase();
        do {
            if (opsi.equals("y") || opsi.equals("yes")) {
                editProfile(curUser);
            } else if (opsi.equals("n") || opsi.equals("no")) {
                tf = true;
            } else {
                System.out.println("Masukan jawaban yang valid!");
                opsi = s.next();
            }
        } while (tf);
    }

    public void editProfile(User curUser) {
        String ganti, jwb;
        boolean selesai = false;

        do {
            System.out.println("Mau edit yang mana?");
            System.out.printf("[1] Nama User: %s\n", curUser.getUsername());
            System.out.printf("[2] Role: %s\n", curUser.getRole());
            System.out.printf("[3] E-mail: %s\n", curUser.getEmail());
            System.out.printf("[4] Password: %s\n", curUser.getPwd());
            System.out.println("Mau Edit Yang Mana? (1-4)");
            String opsi = s.next();

            switch (opsi) {
                case "1":
                    System.out.print("Masukan nama user yang baru: ");
                    ganti = s.next() + s.nextLine();
                    System.out.printf("Nama username yang baru: %s\n", ganti);
                    System.out.println("Apakah anda yakin (y/n)?");
                    jwb = s.next();
                    if (jwb.equals("y") || jwb.equals("yes")) {
                        curUser.setUsername(ganti);
                        System.out.printf("Nama berhasil diganti ke %s!\n", curUser.getUsername());
                        selesai = true;
                    } else if (jwb.equals("n") || jwb.equals("no")) {
                        selesai = false;
                    } else {
                        System.out.println("Masukan jawaban yang valid!");
                    }
                    break;

                case "2":
                    break;

                case "3":
                    System.out.print("Masukan e-mail yang baru: ");
                    ganti = s.next() + s.nextLine();
                    System.out.printf("e-mail yang baru: %s\n", ganti);
                    System.out.println("Apakah anda yakin (y/n)?");
                    jwb = s.next();
                    if (jwb.equals("y") || jwb.equals("yes")) {
                        curUser.setEmail(ganti);
                        System.out.printf("Email berhasil diganti ke %s!\n", curUser.getEmail());
                        selesai = true;
                    } else if (jwb.equals("n") || jwb.equals("no")) {
                        selesai = false;
                    } else {
                        System.out.println("Masukan jawaban yang valid!");
                    }
                    break;

                case "4":
                    System.out.print("Masukan password yang baru: ");
                    ganti = s.next() + s.nextLine();
                    System.out.printf("Password yang baru: %s\n", ganti);
                    System.out.println("Apakah anda yakin (y/n)?");
                    jwb = s.next();
                    if (jwb.equals("y") || jwb.equals("yes")) {
                        curUser.setPwd(ganti);
                        System.out.printf("Password berhasil diganti ke %s!\n", curUser.getPwd());
                        selesai = true;
                    } else if (jwb.equals("n") || jwb.equals("no")) {
                        selesai = false;
                    } else {
                        System.out.println("Masukan jawaban yang valid!");
                    }
                    break;

                default:
                    System.out.println("Masukin opsi yang valid ndul");
                    break;
            }
        } while (!selesai);
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
            
        }
    }
}
