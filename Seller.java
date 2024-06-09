import java.util.*;

public class Seller extends User {

    private int saldo;
    private Queue listOrder = new Queue();
    private LinkedList<Produk> listProduct = new LinkedList<Produk>();
    private LinkedList<Order> historyOrder = new LinkedList<Order>();

    public Seller(String username, String role, String email, String pwd) {
        super(username, role, email, pwd);
        role = "Penjual";
    }

    public void addProduct(Produk product) {
        listProduct.add(product);
    }

    public LinkedList<Produk> getListProduct() {
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
            System.out.println("");
        }
    }

    public void deleteProduk(int delete) {
        listProduct.remove(delete);
    }

    public void seeOrder() {
        for (int i = 0; i < listOrder.sizeQueue(); i++) {
            System.out.println("no : " + (i + 1));

        }
    }

    public void setListOrder(Queue listOrder) {
        this.listOrder = listOrder;
    }

    public Queue getListOrder() {
        return listOrder;
    }

    public void seeAllOrder() {
        for (int i = 0; i < listOrder.sizeQueue(); i++) {

        }
    }

    public void processOrder() {
        Scanner s = new Scanner(System.in);
        System.out.println("Proses pesanan : ");
        System.out.println("nama : " + listOrder.peek().getCustName());
        System.out.println("pesanan : ");
        for (int i = 0; i < listOrder.peek().getListProduct().size(); i++) {
            System.out.println((i + 1) + " " + listOrder.peek().getListProduct().get(i).getName() + " Rp."
                    + listOrder.peek().getListProduct().get(i).getPrice());
        }
        System.out.println("total : " + listOrder.peek().getTotal());
        System.out.println("proses(y/n) : ");
        String opt = s.next();
        if (opt.equalsIgnoreCase("y")) {
            Order process = listOrder.dequeue();
            process.setIsDone(true);
            System.out.println("pesanan telah diselesaikan");
            saldo += process.getTotal();
            historyOrder.add(process);
        } else {
            System.out.println("pesanan tidak jadi diproses");
        }
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public double avgRating() {
        int total = 0;
        for (int i = 0; i < historyOrder.size(); i++) {
            total += historyOrder.get(i).getRating().getValue();
        }
        if(total <= 0) {
            return 0;
        }
        double avg = total / historyOrder.size();
        return avg;
    }
}
