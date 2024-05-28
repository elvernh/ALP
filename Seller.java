import java.util.*;

public class Seller extends User {

    private int saldo;
    private Queue listOrder = new Queue();
    private LinkedList<Produk> listProduct = new LinkedList<Produk>();
    private LinkedList<Order> historyOrder = new LinkedList<Order>();

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

    public void addMenu(Produk produk) {
        listProduct.add(produk);
    }

    public void searchDetail() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println("no : " + (i + 1));
            System.out.println("Nama : " + listProduct.get(i).getName());
            System.out.println("Deskripsi : " + listProduct.get(i).getDesc());
            System.out.println("Harga : " + listProduct.get(i).getPrice());
            System.out.println("Kategori : " + listProduct.get(i).getKategori());
        }
    }
}
