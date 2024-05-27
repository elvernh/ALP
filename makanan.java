public class Makanan extends Produk {
    private String kategori;

    public Makanan(String name, String desc, int price, String kategori) {
       super(name,desc, price);
       this.kategori = kategori;
    }
}
