import java.util.LinkedList;

public class Customer extends User {
    private int points;
    private String alamat;
    private int saldo;
    
    public Customer(String username, String role, String pwd, String email) {
        super(username, role, pwd, email);
        role = "customer";
        points = 10;
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
}
