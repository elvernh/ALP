import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MenuCustomer {
    Scanner s = new Scanner(System.in);

    public void menu(User curUser, ArrayList<Seller> listSeller, ArrayList<Customer> listCustomer, LoginRegister lr)
            throws IOException {
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
            System.out.println("2. Lihat pesanan");
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

            } else if (opt == 4) {

            } else if (opt == 5) {
                System.out.println("masukkan jumlah uang : ");
                int topUp = s.nextInt();
                updateDataTopup(curUser, topUp, listCustomer);
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
                System.out.println("order berhasil dibuat");
            } else if (opt2.equalsIgnoreCase("n")) {

            }
        } else {
            System.out.println("uang anda tidak mencukupi");
        }

    }

    public void updateDataTopup(User curUser, int jumlah, ArrayList<Customer> listCustomer) throws IOException {
        File database = new File("customer.txt");
        File temp = new File("temp.txt");

        FileReader fileInput;
        BufferedReader bufferInput;

        FileWriter fileTemp;
        BufferedWriter bufferTemp;

        try {
            fileInput = new FileReader("customer.txt");
            bufferInput = new BufferedReader(fileInput);

            fileTemp = new FileWriter(temp);
            bufferTemp = new BufferedWriter(fileTemp);

        } catch (Exception e) {
            System.out.println(e);
            return ;
        }
        for (int i = 0; i < listCustomer.size(); i++) {
            if(curUser.equals(listCustomer.get(i))) {
                System.out.println("ok");
            }
        }
        // String data = bufferInput.readLine();
        // User user;
        // ArrayList<Customer> tempCust = new ArrayList<Customer>();
        // while (data != null) {
        //     StringTokenizer tokend = new StringTokenizer(data, ",");
        //     String uname = tokend.nextToken();
        //     String role = tokend.nextToken();
        //     String email = tokend.nextToken();
        //     String pwd = tokend.nextToken();
        //     String alamat = tokend.nextToken();
        //     String saldo = tokend.nextToken();
        //     String points = tokend.nextToken();
        //     int saldoInt = Integer.parseInt(saldo);
        //     int pointsInt = Integer.parseInt(points);
        //     user = new Customer(uname, role, email, pwd, alamat, saldoInt, pointsInt);
        //     tempCust.add(((Customer) user));
        //     data = bufferInput.readLine();
        // }
        // bufferInput.close();
        // for (int i = 0; i < tempCust.size(); i++) {
        //     if (tempCust.get(i).equals((Customer) curUser)) {
        //         tempCust.get(i).topUp(jumlah);
        //         System.out.println(tempCust.get(i).getSaldo());
        //         break;
        //     }else {
        //         System.out.println(0);
        //     }
        // }
        // for (int a = 0; a < tempCust.size(); a++) {
        //     bufferTemp.write(tempCust.get(a).getUsername() + "," +
        //             tempCust.get(a).getRole() + ","
        //             + tempCust.get(a).getEmail() + "," +
        //             tempCust.get(a).getPwd() + "," +
        //             tempCust.get(a).getAlamat() + "," +
        //             tempCust.get(a).getSaldo() + "," +
        //             tempCust.get(a).getPoints());
        //     bufferTemp.newLine();
        //     bufferTemp.flush();
        // }
        // bufferTemp.close();
        // fileTemp.close();
        // bufferInput.close();
        // fileInput.close();

        // database.delete();
        // temp.renameTo(database);

    }
}
