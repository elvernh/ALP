import java.util.*;

public class Seller extends User {

    private int saldo;
    private Queue listOrder = new Queue();
    private LinkedList<Produk> listProduct = new LinkedList<Produk>();
    public Seller(String username, String role, String pwd, String email) {
        super(username, role, pwd, email);
        role = "Penjual";
    }

    public void addProduct(Produk product) {
        listProduct.add(product);
    }

    public LinkedList getListProduct() {
        return listProduct;
    }
}
