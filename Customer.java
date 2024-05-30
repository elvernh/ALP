import java.util.LinkedList;

public class Customer extends User {
    int points;
    private String alamat;
    int saldo;
    LinkedList<Voucher> listVoucher = new LinkedList<Voucher>();
    
    public Customer(String name, String password) {
        super(name, password);
        role = "customer";
        points = 10;
    }
}
