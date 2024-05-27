public class makanan extends Produk {
    protected String kategori;
    public makanan(String name, int price) {
       super(name, price);
       this.kategori = "Makanan";
    }
}
