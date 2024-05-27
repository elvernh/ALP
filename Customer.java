import java.util.LinkedList;

public class Customer extends User {
    int points;
    private String alamat;
    int saldo;
    LinkedList<Voucher> listVoucher = new LinkedList<Voucher>();
    
    public Customer(String username, String role, String pwd, String email) {
        super(username, role, pwd, email);
        role = "customer";
        points = 10;
    }
}
