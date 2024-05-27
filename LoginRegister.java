import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LoginRegister {
    private LinkedList<User> listuser = new LinkedList<User>();

    

    public void menu() {
        //Mau Login atau Register
        Scanner s = new Scanner(System.in);
        User curUser = null;
        while (curUser == null) {
            System.out.println("Menu");
            System.out.println("1. Login");
            System.out.println("2. Register");
            int choose = s.nextInt();
            if (choose == 1) {
                curUser = login();
            } else if (choose == 2) {
                // curUser = register();
            }
            if (curUser != null) {
            }
        }
    }

    public User login() {
        String tryagain = "";
        while (!tryagain.equalsIgnoreCase("n")) {
            //Minta username dan password
            Scanner s = new Scanner(System.in);
            System.out.println("Please Login");
            System.out.println("email :");
            String email = s.next();
            System.out.println("Password : ");
            String pwd = s.next();

            //Cocokkan username dan password dengan yg ada di list
           for (int i = 0; i < listuser.size(); i++) {
                if(email.equals(listuser.get(i).username) && pwd.equals(listuser.get(i).pwd)) {
                    return listuser.get(i);
                }
           }
            //Berikan pesan error
            System.out.println("Userame or Password don't match ! ");
            System.out.println("Try Again (Y/N) ? ");
            tryagain = s.next();
        }
        return null;
    }

    // public User register() {
    //     //Minta username dan password
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Please Register");
    //     System.out.println("Username :");
    //     String uname = s.next();
    //     System.out.println("Password : ");
    //     String pwd = s.next();

       
       
    // }
}
