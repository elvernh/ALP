public class Penjual extends User{
    protected String role;
    protected int saldo;
    public Penjual(String name, String password){
        super(name, password);
        this.role = "Seller";
        this.saldo = 0;
    }
}
