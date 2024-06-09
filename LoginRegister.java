import java.util.ArrayList;
import java.util.Scanner;

public class LoginRegister {
    ArrayList<Customer> listCustomer = new ArrayList<Customer>();
    ArrayList<Seller> listSeller = new ArrayList<Seller>();

    MenuCustomer menuCustomer = new MenuCustomer();
    MenuSeller menuSeller = new MenuSeller();

    public void menu() {
        // Mau Login atau Register
        Scanner s = new Scanner(System.in);
        User curUser = null;
        while (curUser == null) {
            System.out.println("Menu");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.print("pilih : ");
            int choose = s.nextInt();
            if (choose == 1) {

                curUser = login();

            } else if (choose == 2) {
                curUser = register();
            }
            if (curUser != null) {
                if (curUser.role.equals("admin")) {

                } else if (curUser.role.equals("customer")) {
                    menuCustomer.menu(curUser, listSeller, this);
                } else if (curUser.role.equals("penjual")) {
                    menuSeller.menu(curUser, listCustomer, this);
                }
            } else {
                System.out.println("null");
            }
        }
    }

    public User login() {
        String tryagain = "";
        while (!tryagain.equalsIgnoreCase("n")) {
            // Minta username dan password
            Scanner s = new Scanner(System.in);
            System.out.println("Please Login");
            System.out.print("email :");
            String email = s.next() + s.nextLine();
            System.out.print("Password : ");
            String pwd = s.next() + s.nextLine();

            // Cocokkan username dan password dengan yg ada di list
            for (int i = 0; i < listSeller.size(); i++) {
                if (email.equals(listSeller.get(i).email) && pwd.equals(listSeller.get(i).pwd)) {
                    return listSeller.get(i);
                }
            }
            for (int i = 0; i < listCustomer.size(); i++) {
                if (email.equals(listCustomer.get(i).email) && pwd.equals(listCustomer.get(i).pwd)) {
                    return listCustomer.get(i);
                }
            }
            // Berikan pesan error
            System.out.println("Userame or Password don't match ! ");
            System.out.println("Try Again (Y/N) ? ");
            tryagain = s.next();
        }
        return null;
    }

    public User register() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Register");
        System.out.print("Username : ");
        String uname = s.next();
        System.out.print("role :");
        System.out.println("pilih ");
        System.out.println("1. customer");
        System.out.println("2. seller");
        System.out.print("pilih : ");
        int opt = s.nextInt();
        String role = "";
        if (opt == 1) {
            role = "customer";
        } else if (opt == 2) {
            role = "penjual";
        }
        System.out.print("email : ");
        String email = s.next();
        System.out.print("Password : ");
        String pwd = s.next();
        User user = null;
        if (opt == 1) {
            user = new Customer(uname, role, email, pwd);
            listCustomer.add((Customer) user);
        } else if (opt == 2) {
            user = new Seller(uname, role, email, pwd);
            listSeller.add((Seller) user);
        }

        return user;

    }
}
