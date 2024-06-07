import java.time.LocalDate;
import java.util.LinkedList;

public class Order {
    private String custName, sellerName, alamat;
    private int total;
    private LinkedList<Produk> listProduct = new LinkedList<Produk>();
    private Boolean isDone;
    LocalDate date;
    public Order(String custName, String sellerName,  String alamat) {
        this.custName = custName;
        this.sellerName = sellerName;
        this.alamat = alamat;
        this.total = total;
        isDone = false;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
    public LinkedList<Produk> getListProduct() {
        return listProduct;
    }
    public void setListProduct(LinkedList<Produk> listProduct) {
        this.listProduct = listProduct;
    }
    public String getSellerName() {
        return sellerName;
    }
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
}
