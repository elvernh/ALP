import java.util.ArrayList;
import java.util.Scanner;

public class MenuCustomer {
    Scanner s = new Scanner(System.in);
    private ArrayList<Seller> listSeller = new ArrayList<Seller>();

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
            } else if (opt == 2) {

            } else if (opt == 3) {

            } else if (opt == 4) {

            } else if (opt == 5) {
                lr.menu();
            }
        }
    }

    public void pesanMakanan(ArrayList<Seller> listSeller) {
        showSeller(listSeller);
    }

    public void showSeller(ArrayList<Seller> listSeller) {
        for (int i = 0; i < listSeller.size(); i++) {
            System.out.println(i + 1);
            System.out.println("nama " + listSeller.get(i).username);
        }
    }
}
