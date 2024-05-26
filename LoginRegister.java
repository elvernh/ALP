import java.util.*;
public class LoginRegister {
    String username, password;
    boolean accountFound = false;
    Scanner sc = new Scanner(System.in);
    public void register(ArrayList<User> user){

    }

    public void login(ArrayList<User> user){
        System.out.print("Masukan username: ");
        username = sc.next() + sc.nextLine();
        System.out.print("Masukan password: ");
        password = sc.next() + sc.nextLine();
        for (int i = 0; i < user.size(); i++) {
            if(user.get(i).getName() == username && user.get(i).getPassword() == password){
                if(accountFound == true) System.out.println("Akun ditemukan!"); break;
            }
        }
        if(accountFound == false) System.out.println("Username / password salah, coba lagi");
    }
}
