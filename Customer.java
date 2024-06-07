import java.util.LinkedList;

public class Customer extends User {
    private int points;
    private String alamat;
    private int saldo;
    private LinkedList<Order> listOrder = new LinkedList<Order>();
    public Customer(String username, String role, String email, String pwd) {
        super(username, role, email, pwd);
        role = "customer";
        points = 10;
    }
    public void showOrder() {
        for (int i = 0; i < listOrder.size(); i++) {
            System.out.println("no : " + (i + 1));
            System.out.println("Seller : " + listOrder.get(i).getSellerName());
            System.out.println("Jumlah : " + listOrder.get(i).getListProduct().size());
            System.out.println("Total : " + listOrder.get(i).getTotal());
            if(listOrder.get(i).getIsDone() == true) {
                System.out.println("status : selesai");
            }else {
                System.out.println("status : proses");
            }
        }
    }
    public LinkedList<Order> getListOrder() {
        return listOrder;
    }

    public void addOrder(Order order) {
        listOrder.add(order);
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
    public String getAlamat() {
        return alamat;
    }
}
