import java.util.LinkedList;

public class Customer extends User {
    int points;
    String email;
    int saldo;
    LinkedList<Voucher> listVoucher = new LinkedList<Voucher>();
    
    public Customer(String name) {
        super(name);
        role = "customer";
        points = 10;
    }
}
