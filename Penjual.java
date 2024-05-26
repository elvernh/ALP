public class Penjual extends User{
    protected String role;
    protected int saldo;
    public Penjual(String name){
        super(name);
        this.role = "Seller";
        this.saldo = 0;
    }
}
