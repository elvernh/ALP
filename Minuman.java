public class Minuman extends Produk {
    private String kategori;

    public Minuman(String name, String desc, int price, String kategori) {
        super(name,desc, price);
        this.kategori = kategori;
    }
}
