import java.util.LinkedList;

public class Seller extends User {

    int saldo;
    
    public Seller(String username, String role, String pwd, String email) {
        super(username, role, pwd, email);
        role = "Penjual";
    }
}
